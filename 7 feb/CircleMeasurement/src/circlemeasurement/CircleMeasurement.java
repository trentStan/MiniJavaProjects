/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlemeasurement;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class CircleMeasurement {

    private int radius;
    
    public void enterRadius(){
        radius = Integer.parseInt(JOptionPane.showInputDialog("Enter the radius of circle"));
    }
    public int calcDiameter(){
        return 2 * radius;
    }
    
    public double calcCircumference(){
        return 2 * Math.PI * radius;
    }
    
    public double calcArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    
    public void Display(){
        JOptionPane.showMessageDialog(null, toString());
    }
    
    public String toString(){
        
        DecimalFormat df = new DecimalFormat("#.##");
        return "Diameter: " + calcDiameter()
             + "\nCircumference: " + df.format(calcCircumference())
             + "\nArea: " + df.format(calcArea());
    }
    public static void main(String[] args) {
        CircleMeasurement circle = new CircleMeasurement();
        circle.enterRadius();
        circle.Display();
    }
    
}
