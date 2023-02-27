/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailerrent;

import java.util.Scanner;

/**
 *
 * @author user-pc
 */
public class TrailerRent {

    Scanner input = new Scanner(System.in);
    private int basicCost = 250;
    private int days;
    private int surcharge = 3, discount = 9;
    private double amtPerKm;
    private double distance;
    private double amtDue = 0.0;

    public void enterdetails() {
        System.out.println("Enter amount per Km travelled");
        amtPerKm = input.nextDouble();
        System.out.println("Enter number of days");
        days = input.nextInt();
        System.out.println("Enter distance travelled in Km");
        distance = input.nextDouble();

        calcAmt();
    }

    public void calcAmt() {
        if (distance < 60) {
            amtDue = (basicCost * days + amtPerKm * distance) * ((100 + surcharge) / 100);
        } else if (distance > 350) {
            amtDue = (basicCost * days + amtPerKm * distance) * ((100 - discount) / 100);
        } else {
            amtDue = basicCost * days + amtPerKm * distance;
        }
        display();
    }

    public void display(){
        System.out.println("Amount Due: R" + amtDue);
    }
    
    public static void main(String[] args) {
        new TrailerRent().enterdetails();
    }

}
