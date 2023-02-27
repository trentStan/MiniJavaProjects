
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LMQF353S5
 */
public class Registration {
    
    private static Course[] course = new Course[4];
    private static Student[] student = new Student[4];
    private static String name, surname;
    private static int phone;
    private static String courseName;
    private static String courseID;
    
    public Registration(Student[] student, Course[] course)
    {
        this.course = course;
        this.student = student;
    }
    
    public static void enterDetails()
    {
        name = JOptionPane.showInputDialog("Enter First name");
        surname = JOptionPane.showInputDialog("Enter Surname");
        phone = Integer.parseInt(JOptionPane.showInputDialog("Enter phone number"));
        
        courseName = JOptionPane.showInputDialog("Enter course name");
        courseID = JOptionPane.showInputDialog("Enter Course ID");
    }
    
    public String toString()
    {
        return "Name: "  + student.getName() + 
                "\nSurname:" + student.getSurname() +
                "\nPhone Number: " + student.getPhone() +
                "\nID: " + student.getID() +
                "\nCourse name: " + course.getCourse() +
                "\nCourse ID: " + course.getCourseID(); 
    }
    public static void main(String[] args) {
        enterDetails();
        Registration[] reg = new Registration[2];
        reg = new Registration(new Student(surname, name, phone), new Course(courseID, courseName));
        JOptionPane.showMessageDialog(null, reg.toString());
        
    }
}
