/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int w = 0, p, day = 0;
        double[] amtTaken = {w}, amtRem = null;

        System.out.println("Enter tank amount in Litres");
        w = input.nextInt();
        System.out.println("Enter percentage of water removed each day");
        p = input.nextInt();

        System.out.println("DAY \tAMT TAKEN \tAMT REMAINING"
                + "\n=== \t========= \t=============");

        
        if ( amtRem[0] > 100) {
            do {
                amtRem[day + 1] = amtRem[day] * (1 - p / 100);
                amtTaken[day + 1] = amtRem[day] - amtRem[day];
                System.out.print(day + 1);
                System.out.print("   \t" + amtTaken[day]);
                System.out.print("   \t          \t" + amtRem[day]);
                day++;
            } while (day < 30 || amtRem[day] >= 100);
        }

    }

}
