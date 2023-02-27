/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalinterface;

//3.2
public class Animal implements AnimalInterface {

    private String type;
    private String movement;
    private int numLegs;

    @Override
    public String animalType(String type) {
        this.type = type;
        return this.type;
    }

    @Override
    public String animalMovement(String movement) {
        this.movement = movement;
        return this.movement;
    }

    public int numberOfLegs(int Legs) {
        this.numLegs = Legs;
        return this.numLegs;
    }
}
