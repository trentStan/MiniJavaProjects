/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday11;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Tuesday11 {

    private static String day;
    private static String month;
    private static int number = 5;
    
    public static void enterDetails(){
        day = JOptionPane.showInputDialog("Enter Day");
        month = JOptionPane.showInputDialog("Enter Month");
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    
    public void showDetails(){
        JOptionPane.showMessageDialog(null, toString());
    }
    public String toString(){
        return getDay() + " " + getMonth();
    }
    public static void main(String[] args) {
      //Tuesday11.number = Tuesday11.number + 8;  
        Tuesday11 tue = new Tuesday11();
        enterDetails();
        tue.showDetails();
        new Tuesday11().enterDetails();
        new Tuesday11().showDetails();
        //System.out.println(number);
    }
    
}
