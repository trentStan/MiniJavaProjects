/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LMQF353S5
 */
public class PIWorker extends Employee{
    private int shift;
    private double hourlyPayRate;

    public PIWorker(int shift, double hourlyPayRate, String name, String surname) {
        super(name, surname);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }
    public static void main(String[] args) {
        PIWorker chris = new PIWorker(1, 23.5, "Chris", "Tucker");
    }
    
}
