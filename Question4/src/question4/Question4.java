/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int[] angles = new int[3];

        for (int count = 0; count < angles.length; count++) {
            System.out.println("Enter the " + (count + 1) + " number");
            angles[count] = input.nextInt();
        }

        if(angles[0] == angles[1] || angles[0] == angles[2] || angles[1] == angles[2])
        {
            if(angles[0] == angles[1] && angles[0] == angles[2])
            {
                System.out.println("this is an quilateral triangle");
            }
            else 
            {
                System.out.println("This is an isoceles triangle");
            }
        }
        else
        {
            System.out.println("this is a scalene triangle");
        }
    }

}
