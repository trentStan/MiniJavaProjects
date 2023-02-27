/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.pkg5;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Project25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int vehicleLoad;
        int numComputers;
        int remainingCom;
        
        System.out.println("enter vehicle load");
        vehicleLoad = input.nextInt();
        System.out.println("Enter number of computers to be transported");
        numComputers = input.nextInt();
        
        if(numComputers > vehicleLoad)
        {
            remainingCom = numComputers - vehicleLoad;
            System.out.println("\nCome back to receive the remaining computers" + 
                             "\nRemaining computers: " + remainingCom);
            
        }
        else
        {
            System.out.println("All computers received");
        }
    }
    
}
