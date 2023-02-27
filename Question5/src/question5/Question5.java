/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int year;
        
        System.out.println("Enter year");
        year = input.nextInt();
        
        if(year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0)))
        {
            System.out.println(year + " is a leap year");
        } 
        else 
        {
            System.out.println(year + "is not a leap year");
        }
    }
    
}
