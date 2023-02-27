/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday106;

import java.util.Scanner;

/**
 *
 * @author LMQF353S5
 */
public class Tuesday106 {

    int count;
    int total = 0;
    String sentence;
    private char letter;
    Scanner input = new Scanner(System.in);
    
    public void enterDetails() {
       
        System.out.println("Enter the Sentence");
        sentence = input.nextLine();
         System.out.println("Enter the letter");
        letter = input.next().charAt(0);
        calculate();
        System.out.println(count);
    }

    public void calculate(){
        char[] sentenceChar = sentence.toCharArray();
        for(int counter = 0; counter < sentence.length(); counter++){
            if(sentenceChar[counter] == letter){
                count++;
            }
        }
    }
    public static void main(String[] args) {
        new Tuesday106().enterDetails();
    }

}
