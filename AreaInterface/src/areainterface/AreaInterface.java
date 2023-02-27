/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areainterface;

import java.rmi.Remote;

/**
 *
 * @author user-pc
 */
public interface AreaInterface extends Remote{

    /**
     * @param args the command line arguments
     */
    public double square(int sideLength);
    public double triangle(int base, int height);
    public double rectangle(int x, int y);
    public double circle(int radius);
}
