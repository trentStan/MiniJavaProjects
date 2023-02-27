/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3.pkg1;

import java.util.Scanner;

/**
 *
 * @author lmqf353s5
 */
public class Project31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double salary;
        int noDepend;
        double salaryPercent = 0;
        double medContrib = 0;
        
        System.out.println("Enter monthly salary");
        salary = input.nextDouble();
        System.out.println("Enter number of dependants");
        noDepend = input.nextInt();
        
        if(salary < 5000)
        {
                salaryPercent = 2;
        }
        else
        {
            if(noDepend == 0)
            {
                salaryPercent = 4;
            }
            else
            {
                salaryPercent = 3.5;
            }
        }
        medContrib = salary * (salaryPercent / 100);
        
        System.out.println("Medical aid contribution: " + medContrib);
    }
    
}
