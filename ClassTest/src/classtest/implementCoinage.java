/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtest;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author user-pc
 */
public class implementCoinage extends UnicastRemoteObject implements Coinage {

    public implementCoinage() throws RemoteException {
    }

    @Override
    public int[] calcCoinage(double amount) {
        int[] denCount = {0, 0, 0, 0, 0, 0, 0};

        while (amount >= 50) {
            amount = amount - 50;
            denCount[0]++;
        }
        while (amount >= 20) {
            amount = amount - 20;
            denCount[1]++;
        }
        while (amount >= 10) {
            amount = amount - 10;
            denCount[2]++;
        }
        while (amount >= 1) {
            amount = amount - 1;
            denCount[3]++;
        }
        while (amount >= 0.25) {
            amount = amount -0.25;
            denCount[4]++;
        }
        while (amount >= 0.1) {
            amount = amount -0.1;
            denCount[5]++;
        }
        while (amount >= 0.05) {
            amount = amount -0.05;
            denCount[6]++;
        }

        return denCount;
    }

}
