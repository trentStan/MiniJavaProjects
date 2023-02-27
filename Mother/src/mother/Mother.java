/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mother;

import javax.swing.JMenu;

/**
 *
 * @author LMQF353S5
 */
public class Mother {

    private String surname;

    public Mother(String surname)
    {
        this.surname = surname;
    }
    
    public String getSurname()
    {
        return this.surname;
    }
    public void setSurname(String s)
    {
        this.surname = s;
    }
    public static void main(String[] args) {
           Daughter child = new Daughter("Stanley", "Trent");
           
           System.out.println("Full name of daughter: " + child.getName() + " " + child.getSurname());
    }

}

class Daughter extends Mother {

    private String name;

    public Daughter(String surname, String name) {       // always start with parameters inherited
        super(surname);                                    // number of arguements that you have in the method super() 
        this.name = name;                          // must match number of arguments in parent constructor                              
    } 
    public String getName()
    {
        return this.name;
    }
    public void setName(String n)
    {
        this.name = n;
    }

}
