/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg3.pkg2;

import java.util.Scanner;

/**
 *
 * @author lmqf353s5
 */
public class Project32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double ABC;
        double XYZ = 0;
        
        System.out.println("enter value");
        ABC = input.nextDouble();
        
        if(ABC < 0)
        {
            XYZ = ABC * 2.5;
        }
        else if(ABC > 0)
        {
            XYZ = ABC * (35 / 100);
        }
        else
        {
            XYZ = ABC - (8.3 /100);
        }
        
        System.out.println("output value is: " + XYZ);
    }
    
}
