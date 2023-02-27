/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday10;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Tuesday10 {

    
    public static void main(String[] args) {
        int mark;
        String grade;
        mark = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark"));
        switch (mark/10){
            case 9:
            case 10:
                grade = "A";
               break;
            case 7:
            case 8:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            default:
                grade = "fail";
               
        }
        System.out.println("The grade is: " + grade);
    }
    
}
