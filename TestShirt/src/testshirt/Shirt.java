/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshirt;

/**
 *
 * @author LMQF353S5
 */
public class Shirt {
    private int collarSize;
    private int sleeveLength;
    private  final String MATERIAL = "cotton";

    public Shirt(int collarSize, int sleeveLength) {
        this.collarSize = collarSize;
        this.sleeveLength = sleeveLength;
    }

    public int getCollarSize() {
        return collarSize;
    }

    public void setCollarSize(int collarSize) {
        this.collarSize = collarSize;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(int sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    
    public String toString() {
        return  "The shirt is made out of " + this.MATERIAL + ". The collar size is " + collarSize + ", the sleeve length is " + sleeveLength;
    }
    
}
