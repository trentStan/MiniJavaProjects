/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

/**
 *
 * @author user-pc
 */
public class TestTemperature {

    /*Enter values of the minimum and maximum temperatures for a given
day, then calculate the average temperature of the day. Show the
answer on the computer screen. 
    3 threads
    */
    public static void main(String[] args) {
        Thread t1 = new Thread(new Temperature("min"));
        Thread t2 = new Thread(new Temperature("max"));
        Thread t3 = new Thread(new Temperature("avg"));
        t1.start();
        t2.start();
        
        t3.start();
    }
    
}
