/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstframe;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author LMQF353S5
 */
public class FirstFrame extends JFrame{

    //constructor
    
    public FirstFrame(){
        //invoking the JFrames constructor to set text in the Windows title bar
        super("My First Frame");
        /*invokes method inherited from JFrame with constant EXIT_ON_CLOSE
        as the argument
        allows the program to terminate when user closes the window.
        */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //method to specify the width and height of the window in pixels
        
        // starts with setSize(260,180)
        
        //after label 3 then
        setSize(700,500);
        //user not to change the size of the window
        setResizable(false);
        //creating a JLabel object passing the String "name" to the constructor
        JLabel lblname = new JLabel("Label for the Name");
        //the method setToolTiText() is used to display Enter name when the user 
        //hovers the mouse on the Label lblname
        lblname.setToolTipText("Enter Name Here");
        add(lblname);
        Icon bug = new ImageIcon(getClass().getResource("bug.jpg"));
        JLabel lblsurname = new JLabel("Label with Text and Icon", bug, SwingConstants.LEFT);
        
        //setLayout: where to position each GUI component
        //There is a number of Layout Managers that can be used
        setLayout(new FlowLayout());
        //adding the label to the frame
        
        add(lblsurname);
        //argument is set to be true yo display the window
        //when set to false the window is not displayed
        
        JLabel lblAge = new JLabel();
        lblAge.setText("I am here for label 3 check my position");
        lblAge.setIcon(bug);
        lblAge.setToolTipText("The Last bug");
        lblAge.setHorizontalTextPosition(SwingConstants.CENTER);
        lblAge.setVerticalAlignment(SwingConstants.BOTTOM);
        add(lblAge);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FirstFrame();
    }
    
}
