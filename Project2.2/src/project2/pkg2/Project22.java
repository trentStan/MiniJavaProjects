/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.pkg2;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Project22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        float sellPrice;
        int numItems;
        float disPercent = 0;
        float disTotal = 0;
        float amtDue = 0;
        
        System.out.println("Enter selling price");
        sellPrice = input.nextFloat();
        System.out.println("Enter number of items");
        numItems = input.nextInt();
        
        if(numItems >= 10)
        {   
            System.out.println("Enter discount percentage");
            disPercent = input.nextFloat();
        }
        
        disTotal = numItems * sellPrice * (disPercent / 100);
        amtDue = numItems * sellPrice - disTotal;

        System.out.println("\nThe total Discount: " + disTotal +
                           "\nThe amount due: " + amtDue);
        
    }
    
}
