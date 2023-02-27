/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsum;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class Numbers {
    private ArrayList<Integer> numbers = new ArrayList<>();
    private int sum = 0;
    private double average;

    public Numbers() {
        capture5Numbers();
        calcSum();
        calcAverage();
        System.out.println("Sum: " + getSum());
        System.out.println("Average: " + getAverage());
    
    }
    
    public void capture5Numbers(){
        
        for(int count = 0; count < 5; count++){
            numbers.add(Integer.parseInt(JOptionPane.showInputDialog("Enter number " + count + ":")));
            
        }
        Collections.sort(numbers);
        
        for(int count= 0; count < 5; count++){
            System.out.print(numbers.get(count) + " ");
        }
        System.out.println("");
    }

    public double getAverage() {
        return average;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
    
    
    public void calcSum(){
        for(int count = 0; count < numbers.size(); count++){
            sum = sum + numbers.get(count);
        }
        calcAverage();
    }

    private void calcAverage() {
        average = sum/numbers.size();
    }
}
