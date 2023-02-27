package work;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lmqf353s5
 */
public class Engine {
    private int number;
    private double size;
    
    public Engine(int number, double size)
    {
        this.number = number;
        this.size = size;
    }
    
    public int getNumber()
    {
        return this.number;
    }
    
    public double getSize()
    {
        return this.size;
    }
}
