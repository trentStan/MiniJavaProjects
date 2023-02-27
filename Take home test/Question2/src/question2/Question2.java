/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0, num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
        sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
    
}
