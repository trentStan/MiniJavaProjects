/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author user-pc
 */
public class Shopping extends JFrame implements ActionListener{

    private static Connection conn;
    JFrame frame;
    JPanel panel;
    JLabel lblName, lblSurname, lblAge, lblAmt;
    JTextField name, surname, age, amt;
    JButton add, clear;
    
    public void DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/Shopping", "root", "");
        System.out.println("Connection: " + conn);
    }

    public Shopping() throws ClassNotFoundException, SQLException {
        DBConnection();
    
        this.setTitle("Shopping");
        this.setSize(400, 400);
        
        this.setLayout(new GridLayout(5,2));
        
        lblName = new JLabel("Name:");
        lblSurname = new JLabel("Surname:");
        lblAge = new JLabel("Age:");
        lblAmt = new JLabel("Amount:");
        
        name = new JTextField();
        surname = new JTextField();
        age = new JTextField();
        amt = new JTextField();
        
        add = new JButton("Add");
        clear = new JButton("Clear");
        add.addActionListener(this);
        clear.addActionListener(this);
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));
        panel.add(add);
        panel.add(clear);
        
        this.add(lblName);
        this.add(name);
        this.add(lblSurname);
        this.add(surname);
        this.add(lblAge);
        this.add(age);
        this.add(lblAmt);
        this.add(amt);
        this.add(panel);
        
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        
        if(event.equals("add")){
            
        } else if(event.equals("Clear"))
    }

    
}
