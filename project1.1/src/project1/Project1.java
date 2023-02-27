/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double amtDue = 0;
        int distance;
        double specAmt;
        int basicCost = 200;
        
        System.out.println("Enter cost per Km");
        specAmt = input.nextDouble();
        System.out.println("enter distance travelled");
        distance = input.nextInt();
        
        if(distance < 50)
        {
            int surcharge = 5;
            amtDue = (basicCost + specAmt * distance) * (1+ surcharge/100);
        }
        if(distance > 400)
        {
            int discount = 12;
            amtDue = (basicCost + specAmt * distance) * (1 - discount/100);
        }
        else
        {
            amtDue = (basicCost + specAmt * distance);
        }
        System.out.println("The amount due is: " + amtDue);
    }
    
}
