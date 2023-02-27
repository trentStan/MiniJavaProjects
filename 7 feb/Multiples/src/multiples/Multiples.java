/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples;

import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class Multiples {

    private int multiple, number;
    
    public void enterNumbers(){
        multiple = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number(Multiple)"));
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
    }
    public void multipleCheck(){
        if(multiple % number == 0){
            JOptionPane.showMessageDialog(null, "The first number is a multiple of the second");
        }else{
            JOptionPane.showMessageDialog(null, "The first number is not a multiple of the second");
        }
    }
    public static void main(String[] args) {
        Multiples multiCheck = new Multiples();
        multiCheck.enterNumbers();
        multiCheck.multipleCheck();
    }
    
}
