/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpizza;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class TestPizza {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        pizza.setDiameter(36);
        pizza.setTopping("Pepperoni");
        pizza.setPrice(90);

        System.out.println("Diameter: " + pizza.getDiameter() + "cm"
                + "\nTopping: " + pizza.getTopping()
                + "\nPrice: R" + pizza.getPrice());
        System.out.println(pizza.getString());
    }

}
