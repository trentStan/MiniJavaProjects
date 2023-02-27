/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.pkg1;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Project21 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double annualSalary;                //Variable declarations
        double taxRate = 0;
        double grossMonthlySal = 0;
        double monthlyTax = 0;
        double netMonthSal = 0;
        char empType = 0;
        
        System.out.println("Enter annual salary");             //input Prompts
        annualSalary = input.nextFloat();
        System.out.println("\nEnter employee type (f or p)");
        empType = input.next().charAt(empType);
        
        switch(empType)                                      //Decision structure
        {
            case 'f':
                taxRate = (float) 29.5;
                break;
            case 'p':
                taxRate = 25;
                break;
            default:
                System.out.println("Input is incorrect");
                    
        }
        
        grossMonthlySal = annualSalary / 12;              //Calculations
        monthlyTax = grossMonthlySal * (taxRate / 100);
        netMonthSal = grossMonthlySal - monthlyTax;
        
        System.out.println("\nGross Monthly Salary: " + grossMonthlySal +     //Output
                           "\nMonthly tax Payable: " + monthlyTax +
                           "\nNet Monthly Salary: " + netMonthSal);
    }
    
}
