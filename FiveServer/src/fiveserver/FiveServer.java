/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiveserver;

import java.io.*;
import java.net.*;

/**
 *
 * @author user-pc
 */
public class FiveServer {

    private int base, height;
    private static int clientCount = 0;

    public FiveServer() throws IOException {
        ServerSocket server = new ServerSocket(91);
        while (true) {
            Socket soc = server.accept();
            clientCount++;
            DataInputStream fromClient = new DataInputStream(soc.getInputStream());
            DataOutputStream toClient = new DataOutputStream(soc.getOutputStream());
            base = Integer.parseInt(fromClient.readUTF());
            height = Integer.parseInt(fromClient.readUTF());
            System.out.println("Client number: " + clientCount + " Connected");
            System.out.println("I received base " + this.base + " and height " + this.height);
            toClient.writeUTF("The answer is " + calcArea() + "\n");
        }
    }

    public double calcArea() {
        return 0.5 * this.base * this.height;
    }

    public static void main(String[] args) throws IOException {
        new FiveServer();
    }

}
