/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.Scanner;

/**
 *
 * @author user-pc
 */
public class Question1 {

    Scanner input = new Scanner(System.in);
    private int height;
    private int radius;
    private final double pi = Math.PI;
    private static double volume = 0.0;
    
    
    private void enterDetails() {
        System.out.println("Enter height");
        height = input.nextInt();
        System.out.println("Enter radius");
        radius = input.nextInt();
    }
    public double calcVolume(){
        enterDetails();
        
        volume = pi * Math.pow(radius, 2) * height;
        
        return volume;
    }
    public static void main(String[] args) {
        System.out.println("the volume is " + new Question1().calcVolume());
    }

    
    
}
