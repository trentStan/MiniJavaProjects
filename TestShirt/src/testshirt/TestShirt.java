/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshirt;

/**
 *
 * @author LMQF353S5
 */
public class TestShirt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shirt shirt1  = new Shirt(20, 15);
        Shirt shirt2 = new Shirt(25, 18);
        
        System.out.println(shirt1.toString());
        System.out.println(shirt2.toString());
    }
    
}
