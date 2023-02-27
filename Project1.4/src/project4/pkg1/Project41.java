/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4.pkg1;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Project41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int depNumber;
        int grossSalary;
        int grossIncome;
        double netIncome;
        int taxRate = 20;
        
        System.out.println("Enter Department number");
        depNumber = input.nextInt();
        System.out.println("Enter gross salary");
        grossSalary = input.nextInt();
        
        if(depNumber == 7)
        {
            grossIncome = 550 + grossSalary; 
        }
        else 
        {
            grossIncome = 500 + grossSalary;
        }
        
        netIncome = grossIncome * (1 + taxRate/100);
        
        System.out.println("The net income is:" + netIncome);   
    }
    
    
}
