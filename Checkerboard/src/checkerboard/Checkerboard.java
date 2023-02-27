/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Checkerboard {

    private int numStars;
    private char asterisk = '*';
    
    public void enterDetails(){
        numStars = Integer.parseInt(JOptionPane.showInputDialog("Enter number of stars"));
        
        
    }
    
    public void Display(){
        for(int outCount = 1; outCount <= 8; outCount++){
            for(int inCount = 1; inCount <= numStars; inCount++){
                if(outCount%2 == 1){
                    System.out.print(asterisk + " ");
                }else{
                    System.out.print(" " + asterisk);
                }
            }System.out.println("");
        }
        
    }
       
    
    public static void main(String[] args) {
        Checkerboard check = new Checkerboard();
        
        check.enterDetails();
        check.Display();
    }
    
}
