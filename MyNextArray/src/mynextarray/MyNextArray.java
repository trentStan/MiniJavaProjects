/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynextarray;

import java.util.Scanner;

/**
 *
 * @author user-pc
 */
public class MyNextArray {

    int[][] marks = new int[4][3];
    Scanner input = new Scanner(System.in);
    
    public void enterDetails(){
        int row, col;
        
        for(row = 0; row < 4; row++){
            for(col = 0; col < 3; col++){
                System.out.println("Enter mark for student " + (row + 1) + ", test " + (col + 1));
                marks[row][col] = input.nextInt();
            }
        }
    }
     
    public static void main(String[] args) {
        new MyNextArray().enterDetails();
    }
    
}
