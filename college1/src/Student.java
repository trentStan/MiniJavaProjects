/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LMQF353S5
 */
public class Student {
    
    private String name, surname;
    private int phone; 
    private static int ID = 3 ;
    
    public Student(String surname, String name,  int phone)
    {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String change)
    {
        this.name = change;
    }
    
     public String getSurname()
    {
        return this.surname;
    }
    
    public void setSurname(String change)
    {
        this.surname = change;
    }
    
    public int getID()
    {
        return this.ID;
    }
    public void setID(int change)
    {
        this.ID = change;
    }
    public int getPhone()
    {
        return this.phone;
    }
    
    public void setPhone(int change)
    {
        this.phone = change;
    }
}
