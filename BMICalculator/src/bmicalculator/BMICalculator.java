/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

/**
 *
 * @author user-pc
 */
public class BMICalculator extends JFrame implements ActionListener {

    private double weight, height, bmi = 0 ;
    JLabel lblWeight = new JLabel("Enter Weight (in kg):");
    JTextField txtWeight = new JTextField();
    JLabel lblHeight = new JLabel("Enter Height(in metres):");
    JTextField txtHeight = new JTextField();
    ButtonGroup btnGroup = new ButtonGroup();
    JRadioButton btnMale = new JRadioButton("Male");
    JRadioButton btnFemale = new JRadioButton("Female");
    JButton btnCalc = new JButton("Calculate BMI");
    JLabel lblBMI = new JLabel("Your BMI is:");

    
    
    
    public BMICalculator() {
        
        
        btnGroup.add(btnMale);
        btnGroup.add(btnFemale);
        btnCalc.addActionListener(this);
        
        add(lblWeight);
        add(txtWeight);
        add(lblHeight);
        add(txtHeight);
        add(btnMale);
        add(btnFemale);
        add(btnCalc);
        add(lblBMI);
        
        setTitle("BMI Calculation");
        setSize(500,250);
        setResizable(false);
        setLayout(new GridLayout(5, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void BMICalc(){
        weight = Double.parseDouble(txtWeight.getText());
        height = Double.parseDouble(txtHeight.getText());
        String category = "Error: select gender";
        DecimalFormat df = new DecimalFormat("##.##");
        
        bmi = weight / Math.pow(height, 2);
        if(btnMale.isSelected()){
            if(bmi < 22.5){
                category = "Underweight";
            }else if(bmi >= 22.5 && bmi < 29.5){
                category = "Ideal Weight";
            }else if(bmi >= 29.5 && bmi < 32.9 ){
                category = "Overweight";
            }else{
                category = "Obese";
            }
            
        }else if(btnFemale.isSelected()){
            if(bmi < 18.5){
                category = "Underweight";
            }else if(bmi >= 18.5 && bmi < 24.5){
                category = "Ideal Weight";
            }else if(bmi >= 24.5 && bmi < 39.5 ){
                category = "Overweight";
            }else{
                category = "Obese";
            }
        }
        
        lblBMI.setText("Your BMI is: " + df.format(bmi) + " (" + category + ")");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object ae = e.getSource();
        
        if(ae.equals(btnCalc)){
            BMICalc();
        }
    }
    
    public static void main(String[] args) {
        new BMICalculator();
    }

    
    
}
