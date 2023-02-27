
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LMQF353S5
 */
public class BMI {

    Scanner input = new Scanner(System.in);

    private double weight;
    private double height;

    private void EnterDetails() {
        System.out.println("Enter Weight");
        weight = input.nextDouble();
        System.out.println("Enter Height");
        height = input.nextDouble();
    }

    public double CalcBmi() {
        return weight * 703 / height;
    }
}
