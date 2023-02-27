/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaclient;

import areainterface.AreaInterface;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author user-pc
 */
public class AreaClient {

    public AreaClient() throws RemoteException, NotBoundException {

        Registry reg = LocateRegistry.getRegistry("localhost", 1099);
        AreaInterface stub = (AreaInterface) reg.lookup("Area");

    }

    public static void main(String[] args) throws RemoteException, NotBoundException {
        new AreaClient();
    }

}
