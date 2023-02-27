/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int principal, time, months;
        double rate, interest, finAmt, installs;
        
        System.out.println("enter principal amount");
        principal = input.nextInt();
        System.out.println("enter number of years");
        time = input.nextInt();
        System.out.println("enter rate");
        rate = input.nextDouble();
        
        months = time * 12;
        interest = (principal * rate * time) / 100;
        finAmt = principal * (1 + interest/100);
        installs = finAmt / months;
        
        System.out.println("interest charged: " + interest);
        System.out.println("Monthly installments: " + installs);
    }
    
}
