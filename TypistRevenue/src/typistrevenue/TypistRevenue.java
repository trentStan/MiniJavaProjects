/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typistrevenue;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author LMQF353S5
 */
public class TypistRevenue {

    DecimalFormat round2 = new DecimalFormat("#.##");
    Scanner input = new Scanner(System.in);
    private final double singleSpace = 4.75;
    private final double doubleSpace = 3.5;
    private final double supplyCost = 15;
    private int numPageSingle;
    private int numPageDouble;
    private double netAmt = 0;

    public int getNumPageSingle() {
        return numPageSingle;
    }

    public void setNumPageSingle(int numPageSingle) {
        this.numPageSingle = numPageSingle;
    }

    public int getNumPageDouble() {
        return numPageDouble;
    }

    public void setNumPageDouble(int numPageDouble) {
        this.numPageDouble = numPageDouble;
    }

    public double getNetAmt() {
        return netAmt;
    }

    public void setNetAmt(double netAmt) {
        this.netAmt = netAmt;
    }

    public void enterDetails() {
        System.out.println("Enter number of single line pages");
        this.numPageSingle = input.nextInt();
        System.out.println("Enter number of double line pages");
        this.numPageDouble = input.nextInt();
    }

    public double calculate() {
        netAmt = singleSpace * numPageSingle + doubleSpace * numPageDouble;
        netAmt = netAmt * (100 - supplyCost)  / 100;
        return getNetAmt();
    }

    @Override
    public String toString() {
        return "The total Jane earned was: R" + round2.format(calculate());
    }
    
    public void showRevenue(){
        System.out.println(toString());
    }
    public static void main(String[] args) {
        TypistRevenue calc = new TypistRevenue();
        calc.enterDetails();
        calc.showRevenue();
    }

}
