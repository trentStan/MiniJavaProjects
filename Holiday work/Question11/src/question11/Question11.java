/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author LMQF353S5
 */
public class Question11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int total = 1;
        int multiplier = 33;
        
        do
        {
            total = total * multiplier;
            System.out.println(total);
            multiplier++;
        }while (multiplier <= 79);
        System.out.println(total);
    }
    
}
