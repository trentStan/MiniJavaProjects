/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import javax.swing.JApplet;

/**
 *
 * @author UMAPAND
 */
public class NewJApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    public void init() {
         setBackground(Color.MAGENTA);
       this.add(new MyPanel());
    }

    // TODO overwrite start(), stop() and destroy() methods
}
