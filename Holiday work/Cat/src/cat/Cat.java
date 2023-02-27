/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat;

/**
 *
 * @author LMQF353S5
 */
public class Cat extends Animal {

    @Override
    public String makeSound() {
        return "Meow";
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat = new Cat();
        
        System.out.println(animal.makeSound());
        System.out.println(cat.makeSound());
    }

}
