/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadserver;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user-pc
 */
public class WorkTask implements Runnable {

    private Socket soc;
    private int height, base;

    public WorkTask(Socket soc) {
        this.soc = soc;

    }

    @Override
    public void run() {

        try {
            DataInputStream fromClient = new DataInputStream(this.soc.getInputStream());
            DataOutputStream toClient = new DataOutputStream(this.soc.getOutputStream());
            
            height = fromClient.readInt(); //Integer.parseInt(fromClient.readUTF());
            base = fromClient.readInt();//Integer.parseInt(fromClient.readUTF());
            toClient.writeUTF("Server received\nbase: " + base + " Height: " + height + "\n"
                + "Area: " + calcArea());
        } catch (IOException ex) {
            Logger.getLogger(WorkTask.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public double calcArea() {
        return base * height * 0.5;
    }
}
