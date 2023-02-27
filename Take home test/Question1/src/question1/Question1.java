/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author user-pc
 */
public class Question1 {

    
    public Question1() {
        for(int outCount = 5; outCount >= 1; outCount--){
            for(int inCount = 1; inCount <= outCount; inCount++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int outCount = 1; outCount <= 5; outCount++){
            for(int inCount = 1; inCount <= outCount; inCount++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    
    public static void main(String[] args) {
        new Question1();
    }
    
}
