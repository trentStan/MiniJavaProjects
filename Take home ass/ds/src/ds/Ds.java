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
public class Ds {

    int top;
    int data[];
    int max;

    public Ds(int max) {
        this.max = max;
        top = -1;
        data = new int[max];
    }

    public boolean push(int x) {
        if (top >= max - 1) {
            System.out.println("Stack overflow");
            return false;
        } else {
            data[++top] = x;
            return true;
        }

    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 1;
        } else {
            return data[top--];
        }
    }

    public int peek() {
        if(top < )
            return 0;
    }

}
