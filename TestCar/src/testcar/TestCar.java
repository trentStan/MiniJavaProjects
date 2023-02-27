
package testcar;

import java.util.Scanner;

public class TestCar {

    static int numObj = 0;
    static String engNo;
    static double size;
    static String name, brand, color;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        captureEngine();
        captureCar();
        Car car = new Car(name, brand, color, new Engine(engNo, size));
        System.out.println(car.toString() + "\nObject Number: " + numObj);
        captureEngine();
        captureCar();
        Car car2 = new Car(name, brand, color, new Engine(engNo, size));
        System.out.println(car2.toString() + "\nObject Number: " + numObj);
        sc.close();
    }

    public static void captureEngine() {
        numObj += 1;
        System.out.print("Enter Engine No: ");
        engNo = sc.next();
        System.out.print("Enter Engine Size: ");
        size = sc.nextDouble();
        
    }

    public static void captureCar(){
        
        System.out.print("Input Name: ");
        name = sc.next();
        System.out.print("Input brand: ");
        brand = sc.next();
        System.out.print("Input color: ");
        color = sc.next();
        
    }

}
