/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
        
        float pizzaCost;
        float jessiePurse;
        float sallyPurse;
        
        System.out.println("enter cost of pizza");
        pizzaCost = input.nextFloat();
        System.out.println("enter Jessies amount of money");
        jessiePurse = input.nextFloat();
        System.out.println("enter sallys amount of money");
        sallyPurse = input.nextFloat();
        
        if (pizzaCost > jessiePurse + sallyPurse)
        {
            System.out.println("Buy a small pizza");
        }
        else if (pizzaCost <= jessiePurse + sallyPurse)
        {
            System.out.println("Buy a large pizza");
        }
    }
    
}
