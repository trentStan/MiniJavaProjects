/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcar;

public class Car {
    
    private String name, brand, color; 
    private Engine eng;

    public Car(String name, String brand, String color, Engine eng) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }

    @Override
    public String toString() {
        return "Car{" + " Car Name=" + getName() + ", Car Brand=" + getBrand() + ", Car Color=" + getColor() + ", Engine Number=" + eng.getEngineNo() + ", Engine Size=" + eng.getSize() +'}';
    }
    
}
