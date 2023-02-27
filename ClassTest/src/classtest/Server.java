/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtest;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author user-pc
 */
public class Server {

    public Server() throws RemoteException, AlreadyBoundException {
        Coinage stub = new implementCoinage();
        Registry reg = LocateRegistry.createRegistry(1099);
        reg.bind("Coins", stub);
    }

    
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        new Server();
    }
    
}
