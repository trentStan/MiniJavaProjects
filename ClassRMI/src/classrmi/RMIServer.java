/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classrmi;

import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.registry.*;

/**
 *
 * @author user-pc
 */
public class RMIServer {
   
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        ReverseAvgInterface stub = new ImplementRevAv();
        Registry reg = LocateRegistry.createRegistry(1099);
        reg.bind("Lino", stub);
    }
}
