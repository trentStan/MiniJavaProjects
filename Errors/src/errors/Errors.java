/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errors;

/**
 *
 * @author LMQF353S5
 */
public class Errors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int y = 4;
        int xx = 0;
        
        try {
        int answer = y/xx;
        }catch(Exception x)
        {
            System.out.println("the error encountered is ArithmeticException: / by zero");
        }
    }
    
}
