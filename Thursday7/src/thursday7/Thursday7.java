/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thursday7;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Thursday7 {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void check() {
        if (name.equalsIgnoreCase("Trent")) {
            JOptionPane.showMessageDialog(null, "Name is Correct");
        } else {
            JOptionPane.showMessageDialog(null, "name is No");
        }

        if (age <= 18) {
            JOptionPane.showMessageDialog(null, "Weed is illegal");
        } else {
            JOptionPane.showMessageDialog(null, "Weed is legal");
        }
    }

    public void enterDetails() {
        name = JOptionPane.showInputDialog("Enter name");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        check();
    }

    public static void main(String[] args) {
        Thursday7 thurs7 = new Thursday7();

        thurs7.enterDetails();
    }

}
