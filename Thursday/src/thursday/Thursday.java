/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thursday;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Thursday {

    private int num1, num2;
    private double n1, n2;
    private int sum = 0;
    public double answer = 0.0;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void enterDetails() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter num 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter num 2"));
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Enter n1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Enter n2"));
    }

    public int calculate() {
        sum = num1 + num2;
        return sum;
    }

    public double calc() {
        answer = n1 / n2;

        return answer;
    }

    public void display() {
        JOptionPane.showMessageDialog(null, toString());
        System.out.printf("%s %.2f\n", "The answer is", answer);
    }

    @Override
    public String toString() {
        return "The sum is " + sum
                + "\nThe quotient is " + answer;
    }

    public static void main(String[] args) {
        Thursday thurs6 = new Thursday();

        thurs6.enterDetails();
        thurs6.calculate();
        thurs6.calc();
        thurs6.display();

    }

}
