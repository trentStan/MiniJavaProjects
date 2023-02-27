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
public class Car {

    private String color, brand; 
    private int VIN;
    private Engine engine;

    public Car(String color, String brand, int VIN, Engine engine) {
        this.color = color;
        this.brand = brand;
        this.VIN = VIN;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
   
  
    public static void main(String[] args) {
        Engine eng = new Engine(43432, 1.6);
        //Car car = new Car("Blue", "BMW", 123543212, new Engine(34323, 2.0));
        Car car = new Car("Blue", "BMW", 123543212, eng);
        System.out.println("Brand: \t\t" + car.getBrand()
                         + "\nColor: \t\t" + car.getColor()
                         + "\nVIN: \t\t" + car.getVIN()
                         + "\nEngine No.: \t" + car.getEngine().getEngineNum()
                         + "\nEngine size: \t" + car.getEngine().getSize());
    }
    
}
