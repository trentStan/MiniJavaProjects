/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author user-pc
 */
public class Question2 {

    public double area = 0.0;

    public double calcArea(double radius) {

        return Math.PI * Math.pow(radius, 2);
    }

    public double calcArea(double width, double height) {

        return width * height;
    }

    public double calcArea(double radius, double height, boolean cylinderCalc) {

        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        Question2 area = new Question2();
        System.out.println("The area of Circle: " + area.calcArea(5));
        System.out.println("The area of Rectangle: " + area.calcArea(5, 4));
        System.out.println("The area of Cylinder: " + area.calcArea(3, 4, true));
    }

}
