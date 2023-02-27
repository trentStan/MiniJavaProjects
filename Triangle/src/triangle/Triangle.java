/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;
import javax.swing.*;
/**
 *
 * @author user-pc
 */
public class Triangle {

    private double base;
    private double height;

    public Triangle() {
       
        
    }

    
    
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double calcArea(){
        return getBase() * getHeight() * 0.5;
    }
    
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        
        String input = JOptionPane.showInputDialog("Enter Base");
       triangle.setBase(Double.parseDouble(input));
       input = JOptionPane.showInputDialog("Enter height");
       triangle.setHeight(Double.parseDouble(input));
        
       JOptionPane.showMessageDialog(null,"The area is: " + triangle.calcArea());
        System.out.println("The area is: " + triangle.calcArea());
    }
    
}
