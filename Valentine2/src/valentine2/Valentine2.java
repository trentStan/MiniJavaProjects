/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentine2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LMQF353S5
 */
public class Valentine2 {

    Random random = new Random();
    Scanner input = new Scanner(System.in);
    private int number, minimum;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void enterDetails() {
        System.out.println("Enter boundary number");
        number = input.nextInt();
        System.out.println("Enter minimum");
        minimum = input.nextInt();
    }

    public void createRandomNumber() {
        int count = 1;
        while (count <= 10) {
            System.out.println(random.nextInt(number));
            count++;
        }
    }
    
    public void createRandomNumber(int minimum){
        int count = 1;
        while (count <= 10) {
            if(){
            System.out.println(random.nextInt(number));
            count++;
            }
        }
    }
        
    
    public static void main(String[] args) {
        Valentine2 numbers = new Valentine2();
        numbers.enterDetails();
        numbers.createRandomNumber();
        numbers.createRandomNumber(numbers.getMinimum());
    }

}
