/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author user-pc
 */
public abstract class Employee {

    private String name, surname;
    private double empNum;

    public Employee(String name, String surname, double empNum) {
        this.name = name;
        this.surname = surname;
        this.empNum = empNum;
    }
    
    
    
    public abstract double earnings();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getEmpNum() {
        return empNum;
    }
        
    
    public static void main(String[] args) {
        new PermanentEmployee("Thando", "Nkosi", 7824);
        new PermanentEmployee("Kabelo", "Mogau", 7825);
        new PartTimeEmployee("Kobus", "Pretorius", 7826);
        new PartTimeEmployee("Xolisa", "Mxutu", 7827);
    }
    
}
