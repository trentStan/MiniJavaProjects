/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtest;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author user-pc
 */
public class Client {

    public Client() throws RemoteException, NotBoundException {
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("Enter Amount");
        double amt = input.nextDouble();

        Registry reg = LocateRegistry.getRegistry("localhost", 1099);
        Coinage stub = (Coinage) reg.lookup("Coins");
        int[] coins = stub.calcCoinage(amt);
        System.out.println("R50: " + coins[0] + "\n"
                + "R20: " + coins[1] + "\n"
                + "R10: " + coins[2] + "\n"
                + "R1: " + coins[3] + "\n"
                + "25c: " + coins[4] + "\n"
                + "10c: " + coins[5] + "\n"
                + "5c: " + coins[6]);
    
        }
    }

    public static void main(String[] args) throws RemoteException, NotBoundException {
        new Client();
    }

}
