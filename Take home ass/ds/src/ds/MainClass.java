/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

/**
 *
 * @author user-pc
 */
public class MainClass {
    
    public static void main(String[] args) {
        Ds stack = new Ds(20);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Peek value " + stack.peek());
        System.out.println("Pop value  " + stack.pop());
        System.out.println("Pop value  " + stack.pop());
    }
}
