/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcars;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class TestCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int monthNum;
        Van mercedes = new Van("Silver", 6, 4);
        
        monthNum = Integer.parseInt(JOptionPane.showInputDialog(null, mercedes));
        mercedes.selection(monthNum);
        
        
    }
    
}
