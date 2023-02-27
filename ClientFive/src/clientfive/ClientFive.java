/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientfive;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author user-pc
 */
public class ClientFive {

    private int base, height;
    Scanner input = new Scanner(System.in);

    public ClientFive() throws IOException {
       
            Socket soc = new Socket("localhost", 91);
            DataInputStream fromServer = new DataInputStream(soc.getInputStream());
            DataOutputStream toServer = new DataOutputStream(soc.getOutputStream());
            enterDetails();
            toServer.writeUTF(String.valueOf(base));
            toServer.writeUTF(String.valueOf(height));
            System.out.println(fromServer.readUTF());
        
    }

    public static void main(String[] args) throws IOException {
        new ClientFive();
    }

    private void enterDetails() {
        System.out.println("enter base");
        base = input.nextInt();
        System.out.println("enter height");
        height = input.nextInt();
    }
}
