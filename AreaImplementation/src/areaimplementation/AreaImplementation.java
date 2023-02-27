/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaimplementation;

import areainterface.AreaInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author user-pc
 */
public class AreaImplementation extends UnicastRemoteObject implements AreaInterface{

    public AreaImplementation() throws RemoteException {
        
    }

    
    
    @Override
    public double square(int sideLength) {
        return Math.pow(sideLength, 2);
    }

    @Override
    public double triangle(int base, int height) {
        return base * height * 0.5;
    }

    @Override
    public double rectangle(int x, int y) {
        return x * y;
    }

    @Override
    public double circle(int radius) {
        return Math.PI * Math.pow(radius, 2); 
    }

    
    
}
