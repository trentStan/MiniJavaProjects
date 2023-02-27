/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadclient;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author user-pc
 */
public class ThreadClient {

    private int base, height;
    Scanner input = new Scanner(System.in);

    public ThreadClient() throws IOException {
        while (true) {
            Socket soc = new Socket("localhost", 90);
            DataInputStream fromServer = new DataInputStream(soc.getInputStream());
            DataOutputStream toServer = new DataOutputStream(soc.getOutputStream());
            enterDetails();
            toServer.writeInt(height/*String.valueOf(height)*/);
            toServer.writeInt(base/*String.valueOf(base)*/);
            System.out.println(fromServer.readUTF());
        }
    }

    public static void main(String[] args) throws IOException {
        new ThreadClient();
    }

    public void enterDetails() {
        System.out.println("Enter Base");
        base = input.nextInt();
        System.out.println("Enter height");
        height = input.nextInt();
    }

}
