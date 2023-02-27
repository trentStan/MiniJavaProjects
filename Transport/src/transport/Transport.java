/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Transport {

    static String name;

    private static int days;
    private static double pricePerKm;
    private static double kmTravelled;
    private static double amtDue;
    private static double totalAmt;
    private static final double basic = 200;

    public static void EnterDetails() {

        name = JOptionPane.showInputDialog("Enter name");
        kmTravelled = Double.parseDouble(JOptionPane.showInputDialog("Enter Km travelled"));
        days = Integer.parseInt(JOptionPane.showInputDialog("Enter days"));
        pricePerKm = Double.parseDouble(JOptionPane.showInputDialog("Enter price per Km"));

    }

    public static double CalcAmtDue() {

        amtDue = pricePerKm * kmTravelled;

        if (kmTravelled < 50) {
            amtDue = amtDue * 1.05;
        } else if (kmTravelled > 400) {
            amtDue = amtDue * 0.88;
        }
        return amtDue;
    }

    public static double CalcTotal() {
        totalAmt = basic * days + CalcAmtDue();
        return totalAmt;
    }

    public static void PrintAll() {

        System.out.println("The total amount due is: " + CalcTotal());
        JOptionPane.showMessageDialog(null, "Client: " + name + "\nThe total amount due is: " + CalcTotal());
    }

    public static void main(String[] args) {
        EnterDetails();
        PrintAll();
    }

}
