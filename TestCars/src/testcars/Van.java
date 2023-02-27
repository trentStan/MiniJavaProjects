/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcars;

/**
 *
 * @author LMQF353S5
 */
public class Van extends Automobile{
    private String colour;
    private int doors; 

    public Van(String colour, int doors, int wheels) {
        super(wheels);
        this.colour = colour;
        this.doors = doors;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String selection(int monthNum)
    {
        String month;
        
        switch(monthNum)
        {  
            case 1:
                month = "January";
                        break;
            case 2: 
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                        break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Incorrect input";
        } 
        return month;
    }
}
