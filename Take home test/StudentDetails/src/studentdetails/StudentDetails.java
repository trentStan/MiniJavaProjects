/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdetails;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author user-pc
 */
public class StudentDetails extends JFrame implements ActionListener {

    Connection conn;
    Statement st;

    JLabel lblNumber = new JLabel("Number");
    JTextField txtNumber = new JTextField();
    JLabel lblName = new JLabel("Name");
    JTextField txtName = new JTextField();
    JLabel lblSurname = new JLabel("Surname");
    JTextField txtSurname = new JTextField();
    JLabel lblLevel = new JLabel("Level");
    JComboBox comBox = new JComboBox();
    JButton btnInsert = new JButton("Insert");

    public StudentDetails() throws ClassNotFoundException, SQLException {
        dbConnection();

        setTitle("Library");
        setLayout(new GridLayout(5, 2));

        comBox.addItem("Certificate");
        comBox.addItem("Level 1");
        comBox.addItem("Level 2");
        comBox.addItem("Level 3");

        btnInsert.addActionListener(this);
        add(lblNumber);
        add(txtNumber);
        add(lblName);
        add(txtName);
        add(lblSurname);
        add(txtSurname);
        add(lblLevel);
        add(comBox);
        add(btnInsert);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void dbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/Student", "root", "");
        System.out.println("Connection: " + conn);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new StudentDetails();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Object ae = e.getSource();
            st = conn.createStatement();

            if (ae.equals(btnInsert)) {
                st.executeUpdate("INSERT INTO `studentdetails`(`stNumber`, `stName`, `stSurname`, `stLevel`) "
                        + "VALUES ('" + txtNumber.getText() + "','" + txtName.getText() + "','" + txtSurname.getText() + "','" + comBox.getSelectedItem() + "')");
                JOptionPane.showMessageDialog(null, "Record Successfully added");

            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
