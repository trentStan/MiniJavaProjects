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
public class PartTimeEmployee extends Employee {

    private int hoursWorked = 0;
    private double ratePerHour = 300.00;

    public PartTimeEmployee(String name, String surname, double empNum) {
        super(name, surname, empNum);

        if (getEmpNum() == 7826) {
            hoursWorked = 38;
        } else if (getEmpNum() == 7827) {
            hoursWorked = 50;
        }
        
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Employee No: " + getEmpNum());
        System.out.println("Earnings: " + earnings());
        System.out.println("");
    }

    @Override
    public double earnings() {

        return hoursWorked * ratePerHour;
    }

}
