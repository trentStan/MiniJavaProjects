/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Stanlee
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Test test = new Test();

        JFrame f = new JFrame("Create website opener");
        JButton b1 = new JButton("Paste from clipboard");
        b1.setBounds(100, 10, 300, 40);
        //submit button
        JButton b2 = new JButton("Submit");
        b2.setBounds(100, 110, 170, 40);
        //enter name label
        JLabel label = new JLabel();
        label.setText("Enter Website :");
        label.setBounds(10, 20, 100, 100);
        //empty label which will show event after button clicked
        JLabel label1 = new JLabel();
        label1.setBounds(10, 120, 200, 100);
        //textfield to enter name
        JTextField textfield = new JTextField();
        textfield.setBounds(110, 60, 300, 30);
        textfield.setComponentPopupMenu(null);
        //add to frame
        f.add(label1);
        f.add(textfield);
        f.add(label);
        f.add(b1);
        f.add(b2);
        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.paste();
            }
        });
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String URL = textfield.getText();
                f.dispose();
                ProgramCompiler compile = new ProgramCompiler(URL);
                try{
                Process pro = Runtime.getRuntime().exec(URL);
                }catch(Exception f){
                    f.printStackTrace();
                }
            }
        });

        
    }
    
}
