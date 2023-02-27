/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3.pkg4;

import java.util.Scanner;

/**
 *
 * @author lmqf353s5
 */
public class Project34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int numServiceYears;
        int basicSalary = 0;
        int serviceInc = 0;
        int qualificationInc = 0;
        double taxRate = 0;    
        double pensionRate = 0;
        int grossSalary, netSalary;
        boolean qualification;
        char gender = 0;
        int numMonths;
        
        System.out.println("enter number of months employed");
        numMonths = input.nextInt();
        System.out.println("Enter gender M / F");
        gender = input.next().charAt(gender);
        System.out.println("Qualification acquired true/false");        
        qualification = input.nextBoolean();
        
        switch(gender)
        {
            case 'M':
                basicSalary = 7000;
                serviceInc = 150;
                if(!qualification)
                {
                    qualificationInc = 0;
                }
                else
                {
                    qualificationInc = 550;
                }
                taxRate = 10;
                pensionRate = 7;
                break;
            case 'F':
                basicSalary = 6500;
                serviceInc = 140;
                if(!qualification)
                {   
                    qualificationInc = 0;
                } 
                else 
                {
                    qualificationInc = 650;
                }
                taxRate = 8.5;
                pensionRate = 7.5;
                break;
            default:
                System.out.println("Input is incorrect");
        }
        
        numServiceYears = numMonths / 12;
        grossSalary = basicSalary * numMonths + qualificationInc + (numServiceYears * serviceInc);
        netSalary = (int) (grossSalary * (100 - taxRate) /100 * (100 - pensionRate) / 100);
        
        System.out.println("\nGross Salary: " + grossSalary +
                           "\nNet Salary: " + netSalary);
    }
}
