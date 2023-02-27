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
public class Queue {
    int front, rear, currentSize;
    Integer data[];
    int capacity;
    
    public Queue(Integer capacity){
        this.capacity = capacity;
        data = new Integer[capacity];
        front = -1;
        rear = -1;
        currentSize = 0;
    }
    
    public boolean enqueue (Integer val){
        if(currentSize == capacity){
            return false;
        }else{
            if(rear == -1){
                rear = 0;
                front = 0;
                data[rear] = val;
            }else{
                data[++rear] = val;
                currentSize++;
            }
            return true;
        }
        
    }
    
    public Integer dequeue(){
        if(rear == -1){
            return null;
        }else{
            currentSize--;
            Integer val = data[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                data[front] = null;
                front++;
            }
            return val;
        }
       
    }
    
    public Integer getHead(){
        if(rear == -1){
            return null;
        }else{
            return data[front];
        }
    }
    
}
