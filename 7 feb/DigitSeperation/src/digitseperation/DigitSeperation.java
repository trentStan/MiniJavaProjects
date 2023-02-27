/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitseperation;

import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class DigitSeperation {

    private int number;

    public void enterNumber() {
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter integer"));
    }

    public void digitSeperator() {
        
    }

    public static void main(String[] args) {
        DigitSeperation ds = new DigitSeperation();
        ds.enterNumber();
    }

}
