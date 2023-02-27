/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinvert;

/**
 *
 * @author user-pc
 */
public class TestInvert {
   /* Using a method and an array, write a program that takes a string as an input and inverses the characters in it with spaces. For example:
Initial statement: You are welcome
Inverse: w e l c o m e a r e Y o u. */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Invert string = new Invert();
        
        string.captureString();
        string.inverter();
        string.showChangedString();
    }
    
}
