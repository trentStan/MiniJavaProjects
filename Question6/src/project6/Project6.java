/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

import java.util.Scanner;

/**
 *
 * @author Stanlee
 */
public class Project6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int year, month, days = 0;

        System.out.println("enter year");
        year = input.nextInt();
        System.out.println("enter month");
        month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                days = 31;
                break;
            case 2:
                System.out.println("February");
                days = 28;
                if (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))) {
                    days = days + 1;
                }
                break;
            case 3:
                System.out.println("March");
                days = 31;
                break;
            case 4:
                System.out.println("April");
                days = 30;
                break;
            case 5:
                System.out.println("May");
                days = 31;
                break;
            case 6:
                System.out.println("June");
                days = 30;
                break;
            case 7:
                System.out.println("July");
                days = 31;
                break;
            case 8:
                System.out.println("August");
                days = 31;
                break;
            case 9:
                System.out.println("September");
                days = 30;
                break;
            case 10:
                System.out.println("October");
                days = 31;
                break;
            case 11:
                System.out.println("November");
                days = 30;
                break;
            case 12:
                System.out.println("December");
                days = 31;
                break;
        }
        System.out.println("days: " + days);
    }

}
