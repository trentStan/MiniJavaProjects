/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

/**
 *
 * @author LMQF353S5
 */
public abstract class Bicycle {

    public abstract String cycle(String answer);

    public abstract String ride(String Answer);

    public String roll(String answer) {

        return "We are rollin'";
    }

    public String chop()
    {
        return "I'm hungry";
    }
    

    public static void main(String[] args) {
        Mountain table = new Mountain();

        System.out.println(table.toString());
    }

}
