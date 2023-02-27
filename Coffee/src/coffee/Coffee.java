/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Coffee {

    private String type;
    private int numCups;
    private double total;

    public void enterDetails() {
        type = JOptionPane.showInputDialog("Enter coffee type");
        numCups = Integer.parseInt(JOptionPane.showInputDialog("Enter number of cups"));
        display();

    }

    public double calcTotal() {
        switch (type) {
            case "Espresso":
                total = numCups * 20.12;
                break;
            case "Double Espresso":
                total = numCups * 24.12;
                break;
            case "Ristetto":
                total = numCups * 30.12;
                break;
            case "Cappucino":
                total = numCups * 33.12;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid coffee name");
        }
        return total;
    }

    public void display() {

        DecimalFormat df = new DecimalFormat("##.##");
        JOptionPane.showMessageDialog(null, "The total is R" + df.format(calcTotal()));
    }

    public static void main(String[] args) {
        new Coffee().enterDetails();
    }

}
