/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday103;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Tuesday103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sentence;
        int position;
        String bx, bx1;
        String word1, word2;
       // sentence = JOptionPane.showInputDialog("Enter sentence");
       // position = sentence.indexOf("name");
       // System.out.println("Position: " + position);
       // bx = sentence.substring(4);
        //System.out.println(bx);
        
       // bx1 = sentence.substring(3, 7);
        //System.out.println(bx1);
        
        word1= JOptionPane.showInputDialog("Enter first word");
        word2= JOptionPane.showInputDialog("Enter second word");
        
        
        System.out.println(word1.concat(" " + word2));
    }
    
}
