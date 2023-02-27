/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3.pkg3;

import java.util.Scanner;

/**
 *
 * @author lmqf353s5
 */
public class Project33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        char person = 0; 
        boolean member;
        int fee = 0;
        
        System.out.println("Enter age code");
        person = input.next().charAt(person);
        System.out.println("member true/false");
        member = input.nextBoolean();
        
        switch(person)
        {
            case 'A':
                fee = 25;
                break;
            case 'C':
                fee = 8;
                break;
            default:
                System.out.println("Input is entered incorrectly");       
        }
        if (member != true)
        {
            fee = fee * (150 / 100);
        }
        
        System.out.println("The entrance fee is: " + fee);
    }
    
}
