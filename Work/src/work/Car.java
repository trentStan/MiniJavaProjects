/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work;

/**
 *
 * @author lmqf353s5
 */
public class Car {
    private Engine boom;
    private Brake[] grind;
    
    public Car(Engine boom, Brake[] grind)
    {
        this.boom = boom; 
        this.grind = grind;
    }
}
