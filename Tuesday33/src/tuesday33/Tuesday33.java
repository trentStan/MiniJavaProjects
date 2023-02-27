/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday33;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Tuesday33 {

    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Tuesday33() {
        enterDetails();
        showDetails();
    }

    
    public void enterDetails() {
        mark = Integer.parseInt(JOptionPane.showInputDialog("Enter mark"));
    }

    public String checkDetails() {
        if (getMark() <= 100 && getMark() >= 90) {
            return "A";
        } else if (getMark() <= 89 && getMark() >= 70) {
            return "B";
        } else if (getMark() <= 69 && getMark() >= 60) {
            return "C";
        } else if (getMark() <= 59 && getMark() >= 50) {
            return "D";
        } else if (getMark() < 50) {
            return "Fail";
        } else {
            return "Invalid mark";
        }
    }
    
    @Override
    public String toString() {
        return "The grade is " + checkDetails();
    }
    
    
    public void showDetails() {
        JOptionPane.showMessageDialog(null, toString());
    }

    public static void main(String[] args) {
        new Tuesday33();
    }

}
