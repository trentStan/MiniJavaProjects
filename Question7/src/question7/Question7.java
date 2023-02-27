/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int m, n, count;
        
        System.out.println("enter first number");
        m = input.nextInt();
        System.out.println("enter last number");
        n = input.nextInt();
        
        System.out.println("Number \tNumber Squared");
        System.out.println("====== \t==============");
        
        for(count = m; count <= n; count++)
        {
            System.out.print(count);
            System.out.println("\t" + Math.pow(count, count));
        }
        
        System.out.println("\nReverse order");
        System.out.println("Number \tNumber Squared");
        System.out.println("====== \t==============");
        
        for(count = n; count >= m; count--)
        {
            System.out.print(count);
            System.out.println("\t" + Math.pow(count, count));
        }
        
        System.out.println("\nwhile loops");
        System.out.println("Number \tNumber Squared");
        System.out.println("====== \t==============");
        
        count = m;
        while(count <= n)
        {
            System.out.print(count);
            System.out.println("\t" + Math.pow(count, count));
            count++;
        }
        
        count = m;
        
        System.out.println("\nNumber \tNumber Squared");
        System.out.println("====== \t==============");
        do
        {
            System.out.print(count);
            System.out.println("\t" + Math.pow(count, count));
            count++;
        }while(count <= n);
    }
    
}
