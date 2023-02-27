/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentine;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Valentine {
    
    DecimalFormat round2 = new DecimalFormat("#.##");
    Scanner input = new Scanner(System.in);
    private double number;

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
    
    public void enterDetails() {
        number = input.nextDouble();
    }
    
    public void showAnswer() {
        System.out.println("Number: " + round2.format(getNumber()));
    }
    
    public static void main(String[] args) {
        Valentine why = new Valentine();
        why.enterDetails();
        why.showAnswer();
    }
    
}
