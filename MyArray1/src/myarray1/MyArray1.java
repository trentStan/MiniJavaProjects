/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarray1;

import java.util.Scanner;

/**
 *
 * @author user-pc
 */
public class MyArray1 {

    private int[] numbers = new int[5];
    Scanner input = new Scanner(System.in);
    
    public int[] enterDetails(){
        for(int count = 0; count < numbers.length; count++){
            System.out.println("Enter number " + (count + 1));
            numbers[count] = input.nextInt();
        }
        
        return numbers;
    }
    
    public void calculate(int[] num){
        System.out.println("The output is:");
        for(int count = 0; count< numbers.length; count++ )
        {
            System.out.println(num[count]);
        }
    }
    public static void main(String[] args) {
        new MyArray1().calculate(new MyArray1().enterDetails());
    }
    
}
