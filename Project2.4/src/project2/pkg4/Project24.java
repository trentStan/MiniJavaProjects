/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.pkg4;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Project24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int cycleDist;
        int swimDist;
        
        System.out.println("Enter cycling distance in km");
        cycleDist = input.nextInt();
        System.out.println("Enter swimming distance in m");
        swimDist = input.nextInt();
        
        if(cycleDist >= 20 && swimDist >= 500)
        {
            System.out.println("\nYou qualify for a medal");
        }
        else
        {
            System.out.println("\nYou fail to qualify for a medal");
        }
        
    }
    
}
