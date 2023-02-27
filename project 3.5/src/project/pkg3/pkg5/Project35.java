/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3.pkg5;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Project35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int hoursWorked;
        double ratePerHour, pay;
        
        System.out.println("Enter hours worked");
        hoursWorked = input.nextInt();
        System.out.println("Enter rate per hour");
        ratePerHour = input.nextDouble();
        
        if(hoursWorked == 40 && ratePerHour < 28.5)
        {
            ratePerHour = ratePerHour + 1.5;
        }
        else if(hoursWorked == 40 && ratePerHour >= 28.5)
        {
            ratePerHour = ratePerHour + 1.2;
        }
        else if(hoursWorked > 40 && ratePerHour >= 28.5)
        {
            ratePerHour = ratePerHour * (101.5/100);
        }
        else if(hoursWorked < 40)
        {
            ratePerHour = ratePerHour - 0.5;
        }
        
        pay = hoursWorked * ratePerHour;
        
        System.out.println("Total pay: " + pay);
    }
    
}
