/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestsmallest;

import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class LargestSmallest {

    private int[] numbers = new int[5];

    public void enterNumbers(){
        for(int count = 0; count < numbers.length; count++){
            numbers[count] =  Integer.parseInt(JOptionPane.showInputDialog("Enter number " + (count + 1)));
        }
    }
    
    public int largest(){
        int largest = 0;
        
        for(int count = 0; count < numbers.length; count++){
            if(largest < numbers[count]){
                largest = numbers[count];
            }
        }
        return largest;
    }
    
    public int smallest(){
       int smallest = numbers[0];
       
       for(int count = 0; count < numbers.length; count++){
           if(smallest > numbers[count]){
               smallest = numbers[count];
           }
       }
       return smallest;
    }
    
    public void Display(){
        JOptionPane.showMessageDialog(null, "The largest number is " + largest() +
                                            "\nThe smallest number is " + smallest());
    }
    public static void main(String[] args) {
        LargestSmallest LS = new LargestSmallest();
        LS.enterNumbers();
        LS.Display();
        
    }

}
