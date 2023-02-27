/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author user-pc
 */
public class Engine {
    private int engineNum;
    private double size;

    public Engine(int engineNum, double size) {
        this.engineNum = engineNum;
        this.size = size;
    }

    public int getEngineNum() {
        return engineNum;
    }

    public void setEngineNum(int engineNum) {
        this.engineNum = engineNum;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    
    
}
