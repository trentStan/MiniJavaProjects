/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Scanner;

/**
 *
 * @author LMQF353S5
 */
public class Numbers {

    Scanner input = new Scanner(System.in);
    private int[] marks;
    private int numStudents;
    private double average;
    
    public void enterDetails(){
        System.out.println("Enter number of students");
        numStudents = input.nextInt();
        marks = new int[numStudents];
        
        for(int count = 0; count < marks.length; count++){
            System.out.println("Enter mark for student " + (count + 1));
            marks[count] = input.nextInt();
        }
        display();
    }
    
    public double calcAverage(){
        int sum = 0;
        for(int count = 0; count < marks.length; count++){
            sum += marks[count];
        }
        average = sum / marks.length;
        return average;
    }
    
    public void display(){
        System.out.println("The average is " + calcAverage());
    }
    public static void main(String[] args) {
        new Numbers().enterDetails();
    }
    
}
