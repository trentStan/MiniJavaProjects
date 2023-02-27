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
public class Mountain extends Bicycle {

    @Override
    public String cycle(String answer) {
        return "Very Fast";
    }

    @Override
    public String ride(String Answer) {
        return "Slowly";
    }
    
    @Override
    public String roll(String Answer) {
        super.roll(Answer);
        return "We are not rollin'";
    }

    public String chop(int y) {
        return super.chop() + " " + y; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String toString() {
        return "the super class has " + super.roll(null) + " The Mountain class has " + roll(null)
                + "\n" + super.chop() + chop(5);
    }
}
