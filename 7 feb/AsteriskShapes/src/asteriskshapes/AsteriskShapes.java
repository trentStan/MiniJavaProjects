/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteriskshapes;

import javax.swing.JOptionPane;

/**
 *
 * @author user-pc
 */
public class AsteriskShapes {

    private char asterisk = '*';
    private String shapes = "*********   ***     *       *\n" +
                            "*       *  *   *   ***     * *\n" +
                            "*       * *     * *****   *   *\n" +
                            "*       * *     *   *    *     *\n" +
                            "*       * *     *   *   *       *\n" +
                            "*       * *     *   *    *     *\n" +
                            "*       * *     *   *     *   *\n" +
                            "*       *  *   *    *      * *\n" +
                            "*********   ***     *       *";
    
    public void shapes(){
        for(int count = 0; count < 9; count++){
            switch(count){
                case 1:
                    System.out.println("*********   ***     *       *\n");
                    break;
                case 2:
            }
        }
    }
    public void display() {
        System.out.println(shapes);
        JOptionPane.showMessageDialog(null, shapes);
    }

    public char getAsterisk() {
        return asterisk;
    }

    public String getShapes() {
        return shapes;
    }

    public static void main(String[] args) {
        AsteriskShapes shapes = new AsteriskShapes();
        shapes.display();
    }

}
