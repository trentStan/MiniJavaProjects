/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.pkg3;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Project23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        float commision;
        int salesAmt;
        float commisionPercent;
        int managerComPercent = 5 / 100;
        int basicSalary = 1200;
        float netIncome;
        
        System.out.println("Enter sales amount");
        salesAmt = input.nextInt();
        
        if(salesAmt < 3500)
        {
            commisionPercent = 8 / 100;
        }
        else
        {
            commisionPercent = (float) 12.8 / 100;
        }
        
        commision = salesAmt * commisionPercent * managerComPercent;
        netIncome = basicSalary + commision;
        
        System.out.println("Net income: " + netIncome);
    }
    
}
