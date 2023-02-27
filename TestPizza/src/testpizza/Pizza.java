/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpizza;

public class Pizza {

    private int diameter;
    private String Topping;
    private int price;



    
    public int getDiameter() {
        return diameter;
    }

    public String getTopping() {
        return Topping;
    }

    public int getPrice() {
        return price;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setTopping(String Topping) {
        this.Topping = Topping;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getString()
    {
        return "The diameter of the pizza is " + this.diameter + "cm. the topping is " + this.Topping + " and the price is R" + this.price;
    }
}
