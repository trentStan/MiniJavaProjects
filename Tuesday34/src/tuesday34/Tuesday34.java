/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday34;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Tuesday34 {

    int sum = 0;
    int number;
    int count = 7;

    public void showDetails() {
        JOptionPane.showMessageDialog(null, "The sum is " + calculate());
        JOptionPane.showMessageDialog(null, "The sum is " + calculate1());
        JOptionPane.showMessageDialog(null, "The sum is " + calculate2());
    }

    public int calculate() {
        do {
            sum = sum + count;
            count++;
        } while (count <= number);
        return sum;
    }

    public int calculate1() {
        while (count <= number) {
            sum += count;
            count++;
        }
        return sum;
    }

     public int calculate2() {
         for(;count <= number; count++){
             sum += count;
             
         }
        
        return sum;
    }
     
    public void enterDetails() {
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
        showDetails();
    }

    public static void main(String[] args) {
        new Tuesday34().enterDetails();
    }

}
