/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaserver;

import areaimplementation.AreaImplementation;
import areainterface.AreaInterface;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author user-pc
 */
public class AreaServer {

    public AreaServer() throws RemoteException, AlreadyBoundException {
        AreaInterface stub = new AreaImplementation();
        Registry reg = LocateRegistry.createRegistry(1099);
        reg.bind("Area", stub);
    }

    
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        new AreaServer();
    }
    
}
