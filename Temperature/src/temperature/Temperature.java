/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class Temperature implements Runnable {

    private int min, max, avg;
    private String type;

    public Temperature(String type) {
        this.type = type;
    }
    
    
    
    public void run() {
        if (type.equals("min")) {
            min = Integer.parseInt(JOptionPane.showInputDialog("Enter min temperature"));
        } else if (type.equals("max")) {
            max = Integer.parseInt(JOptionPane.showInputDialog("Enter max temperature"));
        } else if(type.equals("avg")) {
            calcAvg();
            showDetails();
        } 

    }

    public void calcAvg() {
        avg = (max + min) / 2;
    }

    public void showDetails() {
        JOptionPane.showMessageDialog(null, "Min: " + min + "C \n"
                + "Max: " + max + "C \n"
                + "Average: " + avg + "C");
    }

    
}
