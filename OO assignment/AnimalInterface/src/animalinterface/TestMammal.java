/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalinterface;

//3.4
public class TestMammal {

    public static void main(String[] args) {

        Mammal dog = new Mammal(6);
        System.out.println("Animal type: " + dog.animalType("Mammal"));
        System.out.println("Animal movement: " + dog.animalMovement("Classical gallop"));
        System.out.println("Number of legs: " + dog.numberOfLegs(4));
        System.out.println("Number of nipples: " + dog.getNumNipples());
    }
}
