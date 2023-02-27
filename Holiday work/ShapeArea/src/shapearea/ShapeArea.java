/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapearea;

/**
 *
 * @author LMQF353S5
 */
public class ShapeArea {

    public double circleArea(double r)
    {
        return Math.PI * Math.pow(r, 2);
    }
    
    public double rectArea(double width, double height)
    {
        return width * height;
    }
    
    public double cylinderArea(double h, double r)
    {
        return 2 * Math.PI * r * h + 2 * Math.PI * Math.pow(r, 2);
    }
    public static void main(String[] args) {
       
    }
    
}
