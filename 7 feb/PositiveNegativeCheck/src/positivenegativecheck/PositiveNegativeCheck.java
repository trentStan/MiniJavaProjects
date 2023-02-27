/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivenegativecheck;

import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class PositiveNegativeCheck {

    private double[] number = new double[5];

    public void enterNumbers() {
        for (int count = 0; count < number.length; count++) {
            number[count] = Double.parseDouble(JOptionPane.showInputDialog("Enter number " + (count + 1)));
        }
    }

    public String check(double number) {
        if (number < 0) {
            return "Negative";
        } else if (number > 0) {
            return "Positive";
        } else {
            return "Zero";
        }

    }

    public void Display() {
        String table = "";
        for (int count = 0; count < number.length; count++) {
            table = table.concat(number[count] + " is " + check(number[count]) + "\n");
        }
        JOptionPane.showMessageDialog(null, table);
    }

    public static void main(String[] args) {
        PositiveNegativeCheck pn = new PositiveNegativeCheck();
        pn.enterNumbers();
        pn.Display();
    }

}
