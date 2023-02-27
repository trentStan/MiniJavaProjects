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
public class PermanentEmployee extends Employee {

    public PermanentEmployee(String name, String surname, double empNum) {
        super(name, surname, empNum);
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Employee No: " + getEmpNum());
        System.out.println("Earnings: " + earnings());
        System.out.println("");
    }

    @Override
    public double earnings() {

        if (this.getEmpNum() == 7824) {
            return 15500;
        } else if (this.getEmpNum() == 7824) {
            return 14500;
        } else {
            return 0;
        }

    }

}
