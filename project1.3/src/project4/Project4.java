/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Project4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int numHours;
        double normalRate = 16.5;
        double extraRate = 10;
        double totalWages = 0;
        
        System.out.println("enter number of hours worked");
        numHours = input.nextInt();
        
        totalWages = normalRate * numHours;
        
        if(numHours > 40)
        {
            totalWages = totalWages + (numHours - 40) * extraRate;
        }
        
        System.out.println("total wages is: " + totalWages);
    }
    
}
