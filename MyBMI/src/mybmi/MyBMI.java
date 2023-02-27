/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybmi;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LMQF353S5
 */
public class MyBMI extends JFrame {

    JPanel panel = new JPanel();
    JLabel lblHeight = new JLabel("Height:");
    JTextField txtHeight = new JTextField();
    JLabel lblWeight = new JLabel("Weight:");
    JTextField txtWeight = new JTextField();
    JLabel lblBMI = new JLabel("BMI:");
    JTextField txtBMI = new JTextField();
    JButton btnCalculate = new JButton("Calculate");
    JButton btnCancel = new JButton("Cancel");

    public MyBMI(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(4, 2));
        panel.add(lblHeight);
        panel.add(txtHeight);
        panel.add(lblWeight);
        panel.add(txtWeight);
        panel.add(lblBMI);
        panel.add(txtBMI);
        
        
        panel.add(btnCalculate);
        panel.add(btnCancel);
        add(panel);
        pack();
        setVisible(true);
        setResizable(false);
        
        btnCalculate.addActionListener();
    }

    public static void main(String[] args) {
        MyBMI bmi = new MyBMI("My BMI");
    }

}
