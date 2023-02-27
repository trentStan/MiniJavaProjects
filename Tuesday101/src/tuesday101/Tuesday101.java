/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday101;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Tuesday101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mark; 
        int sum = 0;
        String answer;
        
       // mark = Integer.parseInt(JOptionPane.showInputDialog("Enter mark"));
        //answer = (condition) ? if true value or if false value
        //answer = (mark > 90) ? "A" : "Fail";
        //System.out.println("The answer is " + answer);
        
        for(int count = 1; count <= 10; count++){
            sum += count;
            System.out.println("The sum is " + sum);
            if(sum > 30){
                break;
            }
        }
        System.out.println("Sum = " + sum);
        
        for (int count = 1; count <= 10 ;count++){
            
            if(count == 3){
                continue;
            }
            System.out.println("The count is " + count);
            System.out.println("Trent" );
        }
    }
    
}
