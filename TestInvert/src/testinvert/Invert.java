/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinvert;

import javax.swing.*;

/**
 *
 * @author user-pc
 */
public class Invert {

    private String initString, mutString;

    public String getInitString() {
        return initString;
    }

    public void setInitString(String initString) {
        this.initString = initString;
    }

    public String getMutString() {
        return mutString;
    }

    public void setMutString(String mutString) {
        this.mutString = mutString;
    }

    public void captureString() {
        setInitString(JOptionPane.showInputDialog("Enter String"));

    }

    public void inverter() {

        String[] temp = initString.split(" ");
        String[] temp2 = new String[temp.length];
        String temp3 = "";
        char[] tempArr;

        for (int count = 0; count < temp.length; count++) {
            temp2[count] = temp[temp.length - count - 1];
        }

        for (int count = 0; count < temp2.length; count++) {
            temp3 = temp3.concat(temp2[count]);
        }

        tempArr = temp3.toCharArray();
        temp3 = "";
        for (int count = 0; count < tempArr.length; count++) {
            temp3 = temp3.concat(Character.toString(tempArr[count]) + " ");
        }
        setMutString(temp3);
    }

    public void showChangedString() {
        JOptionPane.showMessageDialog(null, "the result is: " + getMutString());
    }

}
