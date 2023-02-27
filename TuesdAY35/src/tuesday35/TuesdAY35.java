/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday35;

import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Tuesday35 {

    private int triDepth;
    
    public void enterDepth(){
    
        triDepth = Integer.parseInt(JOptionPane.showInputDialog("Enter depth"));
    }

    public String toString() {
        enterDepth();
        String triangle = "";
        for(int outCount = 1; outCount <= triDepth; outCount++){
            for(int inCount = 1; inCount <= outCount; inCount++){
                triangle = triangle.concat(Integer.toString(inCount) + " ");
            }
            triangle = triangle.concat("\n");
        }
        return triangle;
    }
    
    
    public void showTri(){
        JOptionPane.showMessageDialog(null, toString());
    }
    public static void main(String[] args) {
        new Tuesday35().showTri();
    }
    
}
