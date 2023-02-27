/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author user-pc
 */
public class ImplementRevAv extends UnicastRemoteObject implements ReverseAvgInterface {

    public ImplementRevAv() throws RemoteException {
    }

    @Override
    public double avg(int[] marks) throws RemoteException {
        int count, sum = 0;
        count = 0;
        
        while(count < marks.length){
            sum = sum + marks[count];
            count++;
        }
        double average = sum/marks.length;
        return average;
    }

    @Override
    public String reverse(String myWords) throws RemoteException {
        char[] arr = myWords.toCharArray();
        char[] revArr = new char[arr.length];
        int inCount = 0;
        for(int count = arr.length -1; count >= 0; count-- ){
            revArr[inCount] = arr[count];
            inCount++;
        } 
        return revArr.toString();
        
    }
    
}
