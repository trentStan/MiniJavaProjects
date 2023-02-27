/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        double r, valueInvest;
        int t, p;
        
        System.out.println("enter principal amount");
        p = input.nextInt();
        System.out.println("Enter number of years");
        t = input.nextInt();
        System.out.println("Enter rate");
        r = input.nextDouble();
        
        valueInvest = p * Math.pow(1+(r/100)/12, 12*t);
        
        System.out.println("Value of investment after " + t +
                " years: " + valueInvest);
    }
    
}
