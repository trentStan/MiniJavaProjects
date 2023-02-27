/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classrmi;

import java.rmi.*;

/**
 *
 * @author user-pc
 */
public interface ReverseAvgInterface extends Remote {
    public double avg(int[] marks) throws RemoteException;
    public String reverse(String myWords) throws RemoteException;
}
