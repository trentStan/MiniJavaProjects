/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int student = 0, max = 0, min = 0, sum = 0, numStudents;
        double average;
        
        System.out.println("enter number of students");
        numStudents = input.nextInt();
        int[] marks = new int[numStudents];
        
        do
        {
            System.out.println("enter student " + (student + 1));
            marks[student] = input.nextInt();
            student++;
        }while(marks[student - 1] >= 0 || marks[student - 1] <= 100);
        
        for(int count = 1; count < marks.length; count++)
        {
            if(marks[count] > marks[count - 1])
            {
                max = marks[count];
            }
        }
        
        for(int count = 1; count < marks.length; count++)
        {
            if (marks[count] < marks[count - 1])
            {
                min = marks[count + 1]  ;
            }
        }
        
        for(int count = 0; count < marks.length; count++)
        {
            sum = sum + marks[count];
        }
        
        average = sum / (marks.length - 1);
        
        System.out.println("maximum: " + max +
                           "minimum: " + min +
                           "average: " + average);
    }
    
}
