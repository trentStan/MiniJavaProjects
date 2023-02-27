/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LMQF353S5
 */
public class MyArray {

    Scanner input = new Scanner(System.in);
    ArrayList<String> myList = new ArrayList<String>();
    ArrayList<Integer> myList1 = new ArrayList<Integer>();
    ArrayList<Double> myList2 = new ArrayList<Double>();

    String[] array = new String[6];

    public void enterDetails() {

        System.out.println("Enter the names");
        for (int count = 0; count < array.length; count++) {

            myList.add(input.next());

        }
    }

    public void printAll() {
        
            System.out.println(myList);
        System.out.println("element of position 3 " + myList.get(1));
    }

    public void printSelection() {

        for (String x : myList) {
            if (x.equalsIgnoreCase("V")) {
                myList.remove(x);
            }
           
        }
    }  
    

    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.enterDetails();
        array.printAll();
        
        
    }

}
