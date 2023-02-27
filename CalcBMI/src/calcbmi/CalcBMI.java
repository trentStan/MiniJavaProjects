/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcbmi;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CalcBMI extends JFrame implements ActionListener{

    JPanel inputPanel = new JPanel();
    JPanel BMIPanel = new JPanel();
    JPanel btnPanel = new JPanel();
    
    JLabel labName = new JLabel("Name:");
    JTextField txtName = new JTextField();
    JLabel labSurname = new JLabel("Surname:");
    JTextField txtSurname = new JTextField();
    JLabel labWeight = new JLabel("Weight:");
    JTextField txtWeight = new JTextField();
    JLabel labHeight = new JLabel("Height:");
    JTextField txtHeight = new JTextField();
    JLabel labBMI = new JLabel("Your BMI is");
    JTextField txtBMI = new JTextField();
    JButton btnCalc = new JButton("Calculate BMI");
    JButton btnClear = new JButton("Clear");
    
    public CalcBMI() {
        inputPanel.setLayout(new GridLayout(4,2));
        inputPanel.add(labName);
        inputPanel.add(txtName);
        inputPanel.add(labSurname);
        inputPanel.add(txtSurname);
        inputPanel.add(labWeight);
        inputPanel.add(txtWeight);
        inputPanel.add(labHeight);
        inputPanel.add(txtHeight);
        
        BMIPanel.setLayout(new GridLayout(1,2));
        
        
        btnPanel.setLayout(new GridLayout(1,2));
        btnPanel.add(btnCalc);
        btnPanel.add(btnClear);
        
        btnCalc.addActionListener(this);
        btnClear.addActionListener(this);
        add(inputPanel);
        add(BMIPanel);
        add(btnPanel);
        setLayout(new GridLayout(3,1));
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    
    public static void main(String[] args) {
        new CalcBMI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ae = e.getSource();
        double weight;
        double height;
        double BMI;
        
        if(ae.equals(btnCalc)){
            weight = Double.parseDouble(txtWeight.getText());
            height = Double.parseDouble(txtHeight.getText());
            
            BMI = weight/(Math.pow(height, 2));
            txtBMI.setText(Double.toString(BMI));
            BMIPanel.setVisible(true);
        }
        if(ae.equals(btnClear)){
            txtName.setText(null);
            txtSurname.setText(null);
            txtWeight.setText(null);
            txtHeight.setText(null);
            txtBMI.setText(null);
            BMIPanel.remove(labBMI);
            BMIPanel.remove(txtBMI);
        }
    }
    
}
