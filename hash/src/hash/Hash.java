/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class Hash {

    HashMap<Integer, String> students = new HashMap<>();
    
    public void enterShit(int size){
        
        for(int count = 0; count < size; count++){
           students.put(Integer.parseInt(JOptionPane.showInputDialog("enter key " + count)), JOptionPane.showInputDialog("Enter value" + count) );
           
        }
    }
    
    public void showShit(){
        for(Integer x: students.keySet()){
            System.out.println(x);
        }
    }
    
    public static void main(String[] args) {
        Hash hash = new Hash();
        
        hash.enterShit(5);
    }
    
}
