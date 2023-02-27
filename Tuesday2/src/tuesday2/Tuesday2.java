/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Tuesday2 {

    private int x, y;
    private double squareRoot;
    private int max, min, pow;
    private double exp;
    
    public void enterDetails(){
        x = Integer.parseInt(JOptionPane.showInputDialog("enter x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Enter y"));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getSquareRoot() {
        return squareRoot;
    }

    public void setSqrt(double sqrt) {
        this.squareRoot = squareRoot;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getPow() {
        return pow;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }
    
    public String calculate(){
        squareRoot = Math.sqrt(x);
        max = Math.max(x, y);
        min = Math.min(x, y);
        pow = (int) Math.pow(x, y);
        exp = Math.exp(x);
        DecimalFormat df = new DecimalFormat("#.##");
        return "The square root: " + df.format(squareRoot) +
                "\nThe max: " + max + 
                "\nThe min: " + min + 
                "\nThe power: " + pow +
                "\nThe exponent: " + df.format(exp);
    }
    
    public void show(){
        JOptionPane.showMessageDialog(null, toString());
    }
    
    public String toString(){
        return calculate();
    }
    public static void main(String[] args) {
        Tuesday2 calc = new Tuesday2();
        calc.enterDetails();
        calc.show();
    }
    
}
