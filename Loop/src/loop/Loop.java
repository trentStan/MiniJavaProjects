/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

/**
 *
 * @author LMQF353S5
 */
public class Loop {

    int sum = 0;
    int y = 0;

    public void forLoop()
    {
         for (y = 0 ;y<= 10; y++)
       {
           sum = sum + y;
       }
        System.out.println("The sum is " + sum);
    }
    
    public static void main(String[] args) {
   
    }

}
