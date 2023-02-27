/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

/**
 *
 * @author lmqf353s5
 */
public class Work {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Engine ex = new Engine(35, 45);
        Brake[] br = new Brake[4];
        br[0] = new Brake("Green"); 
        br[1] = new Brake("Green");
        br[2] = new Brake("Green");
        br[3] = new Brake("Green");
        Car bk = new Car(ex, br);
        
        
    }
    
}
