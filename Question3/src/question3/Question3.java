/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int mark;
        String grade = "";
        
        do
        {
            System.out.println("Enter mark");
            mark = input.nextInt();
            
            if(mark < 0 || mark > 100)
            {
                System.out.println("please enter a mark between 0 - 100");
            }
        }while(mark < 0 || mark > 100);
        
        if (mark <= 100 && mark > 66)
        {
            grade = "A";
        }
        else if (mark <= 66 && mark >= 60)
        {
            grade = "B+";
        }
        else if (mark <= 59 && mark >= 50)
        {
            grade = "B";
        }
        else if (mark <= 49 && mark >= 43)
        {
            grade = "C";
        }
        else if (mark <= 42 && mark >= 40)
        {
            grade = "D";
        }
        else
        {
            grade = "Fail";
        }
        
        System.out.println("\nGrade: " + grade);
    }
    
}
