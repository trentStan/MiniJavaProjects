/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familytest;

/**
 *
 * @author LMQF353S5
 */
public class Son extends Mother implements Father{
    private String name;
    private int age;
    private double height;
    
    public Son(String name, int age, String surname, double height) {
        super(surname);
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String drive() {
        return "Running";
    }

  
    
    
}
