/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalinterface;

//3.3
public class Mammal extends Animal {

    private int numNipples;

    public Mammal(int numNipples) {

        this.numNipples = numNipples;
    }

    public int getNumNipples() {
        return numNipples;
    }

    public void setNumNipples(int numNipples) {
        this.numNipples = numNipples;
    }

}
