/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday105;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Tuesday105 {

    private int count;
    private String name;
    private String newWord = "";
    
    public void enterDetails(){
        name = JOptionPane.showInputDialog("Enter name");
        
        reverseMyString();
        
    }
    
    public void reverseMyString(){
        for(count = name.length() - 1; count >= 0; count--){
           
            
            newWord = newWord + name.charAt(count);
        }System.out.println("The new word is: " + newWord);
    }
    public static void main(String[] args) {
        new Tuesday105().enterDetails();
    }

}
