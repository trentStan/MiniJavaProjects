/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author LMQF353S5
 */
public class Calculator {

    private int num1;
    private int num2;
    private int selection;

    public Calculator(int num1, int num2, int selection) {
        this.num1 = num1;
        this.num2 = num2;
        this.selection = selection;
        option();
    }
    
    public void option()
    {
        switch(this.selection)
        {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                divide();
                break;
            case 4:
                multiply();
                break;
        }
    }
    public void add()
    {
        System.out.println("the sum of " + this.num1 + " and " + this.num2 + " is " + (this.num1 + this.num2));
    }
    
    public void subtract()
    {
        System.out.println("the difference of " + this.num1 + " and " + this.num2 + " is " + (this.num1 - this.num2));
    }
    
    public void divide()
    {
        System.out.println("the quotient of " + this.num1 + " and " + this.num2 + " is " + (this.num1 / this.num2));
    }
    
    public void multiply()
    {
        System.out.println("the product of " + this.num1 + " and " + this.num2 + " is " + (this.num1 * this.num2));
    }
    public static void main(String[] args) {
        int num1, num2, selection = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();
        
        do{
        System.out.println("Select option" +
                            "\n1: Add" +
                            "\n2: subtract" +
                            "\n3: divide" +
                            "\n4: multiply");
        try{
        selection = input.nextInt();
        }catch(Exception x)
        {
            System.out.println("Error: selection chosen is not between 1-4");
        }
        }while(selection < 1 || selection > 4);
        
        Calculator calc = new Calculator(num1, num2, selection);
        JOptionPane.
    }
    
}
