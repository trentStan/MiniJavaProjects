/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LMQF353S5
 */
public class Question2 {
    private int number;
    
    public void instance(int number)
    {
        this.number = number + 10;
        System.out.println(this.number);
    }
    
    public static void main(String[] args) {
        Question2 num = new Question2();
        
        num.instance(23);
        num.instance(24);
        num.instance(25);
    }
}
