/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetting;

/**
 *
 * @author user-pc
 */
public class Vetting {

    int[][] ratings;
    int[] total = new int[5];
    String teachName;

    public Vetting(String teachName, int[][] ratings) {
        this.ratings = ratings;
        this.teachName = teachName;
    }

    public void outputRates() {
        System.out.println("\nThe rates are:\n");
        System.out.printf("%-13s%-15s%-15s%-15s%-15s%-35s\n", "", "Assessment 1", "Assessment 2",
                "Assessment 3", "Assessment 4", "Assessment 5");

        for (int count = 0; count < 5; count++) {

            System.out.printf("%-13s%-15s%-15s%-15s%-15s%-35s\n", "Student " + (count + 1), ratings[count][0],
                    ratings[count][1], ratings[count][2], ratings[count][3], ratings[count][4]);

        }
    }

    public void processRates() {

        getTotal();
        System.out.println("The highest rated asessment score: " + getMax());
        System.out.println("The lowest rated asessment score: " + getMin());
        System.out.println("");
        rateFrequency();
    }

    public int[] getTotal() {
        System.out.print("[");
        for (int outCount = 0; outCount < 5; outCount++) {

            for (int inCount = 0; inCount < 5; inCount++) {
                total[outCount] = total[outCount] + ratings[inCount][outCount];
            }
            System.out.print(total[outCount] + ", ");
        }
        System.out.print("]\n\n");
        return total;
    }

    public int getMax() {
        int max = total[0];

        for (int count = 0; count < 5; count++) {
            if (total[count] > max) {
                max = total[count];
            }
        }

        return max;
    }

    public int getMin() {
        int min = total[0];

        for (int count = 0; count < 5; count++) {
            if (total[count] < min) {
                min = total[count];
            }
        }

        return min;
    }

    public void rateFrequency() {
        System.out.println("Overall rate distrubution:");
        for (int numRate = 0; numRate <= 10; numRate++) {
            System.out.print(numRate + ": ");

            for (int outCount = 0; outCount < 5; outCount++) {

                for (int inCount = 0; inCount < 5; inCount++) {
                    if (ratings[outCount][inCount] == numRate) {

                        System.out.print("*");
                    }
                }
            }
            System.out.println("");
        }

    }

}
