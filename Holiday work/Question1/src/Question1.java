/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LMQF353S5
 */
public class Question1 {
    private int Day;
    
    public int getDay()
    {
        return Day;
    }
    
    public String getDate(int year, int month, int day){
        return year + "/" + month + "/" + day;
    }
    
    public double calcAverage(double total, int numberOfItems)
    {
        return (numberOfItems * total) / numberOfItems;
    }
    
    public int checkMultiple(int number, int multiple)
    {
        return number % multiple;
    }
}
