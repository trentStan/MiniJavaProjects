/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddoreven;

import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class OddOrEven {

    private int number;

    public void enterNumber() {
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
    }

    public void OddEvenCheck() {
        if (number % 2 == 0) {
            JOptionPane.showMessageDialog(null, number + " is an even number");
        } else {
            JOptionPane.showMessageDialog(null, number + " is an odd number");
        }
    }

    public static void main(String[] args) {
        OddOrEven oddoreven = new OddOrEven();
        String repeat;
        do {

            oddoreven.enterNumber();
            oddoreven.OddEvenCheck();
            repeat = JOptionPane.showInputDialog(null, "Repeat odd or even check? y/n");
        } while (repeat.equalsIgnoreCase("y"));

    }

}
