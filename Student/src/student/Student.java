package student;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Student {

    private String name;
    private String surname;
    private double height;
    private int age;
    Scanner input = new Scanner(System.in);

    public void enterDetails() {
        System.out.println("Enter name");
        this.name = input.next();

        System.out.println("Enter surname");
        this.surname = input.next();

        System.out.println("Enter height");
        this.height = input.nextDouble();

        System.out.println("Enter age");
        this.age = input.nextInt();
    }

    public void enterDetails2() {

        name = JOptionPane.showInputDialog("Enter name");

        surname = JOptionPane.showInputDialog("Enter Surname");

        height = Double.parseDouble(JOptionPane.showInputDialog("Enter height"));

        age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
    }

    public static void main(String[] args) {
        Student student = new Student();

        student.enterDetails();
        
        student.Display();
    }

    public void Display() {
        JOptionPane.showMessageDialog(null, toString());
        
        System.out.printf("%s %s\n%s %s \n%.2f\n%s %f \n", "Name:" , name,
                        "Surname:" , surname, 
                        "height:" , height,
                        "Age:", age);
               
    }

    @Override
    public String toString() {
        return "name: " + name
                + "\nsurname: " + surname
                + "\nheight: " + height
                + "\nage: " + age;
    }

}
