/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday104;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Tuesday104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1, number2, number3;
        int largest = 0;
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
        number3 = Integer.parseInt(JOptionPane.showInputDialog("Enter third number"));
        
        
            if(number1 < number2){
                largest = number2;
                if(number2 < number3){
                    largest = number3;
                }
            }else{
                largest = number1;
            }
        System.out.println("largest: " + largest);
        
    }
    
}
