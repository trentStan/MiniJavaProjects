/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Test3 extends JFrame implements ActionListener{
    
    Connection conn;
    Statement st;
    ResultSet rs;
    
    JPanel interfacePanel = new JPanel();
    
    JLabel lblEmpName = new JLabel("New Employee Name:");
    JTextField txtEmpName = new JTextField();
    JLabel lblEmpSurname = new JLabel("New Employee Surname:");
    JTextField txtEmpSurname = new JTextField();
    JLabel lblEmpTelNum = new JLabel("New Employee Telephone Number:");
    JTextField txtEmpTelNum = new JTextField();
    JButton btnAdd = new JButton("Add Employee Details");
    
    public Test3() throws ClassNotFoundException, SQLException {
        dbConnection();
        
        setTitle("Add Sales Staff");
        setLayout(new GridLayout(2,1));
        
        interfacePanel.setLayout(new GridLayout(7,1,10,2));
        lblEmpName.setHorizontalAlignment(JLabel.CENTER);
        interfacePanel.add(lblEmpName);
        interfacePanel.add(txtEmpName);
        lblEmpSurname.setHorizontalAlignment(JLabel.CENTER);
        interfacePanel.add(lblEmpSurname);
        interfacePanel.add(txtEmpSurname);
        lblEmpTelNum.setHorizontalAlignment(JLabel.CENTER);
        interfacePanel.add(lblEmpTelNum);
        interfacePanel.add(txtEmpTelNum);
        interfacePanel.add(btnAdd);
        
        btnAdd.addActionListener(this);
        add(interfacePanel);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void dbConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/staff", "root", "");
        System.out.println("Connection: " + conn);
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new Test3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Object ae = e.getSource();
            st = conn.createStatement();
            if(ae.equals(btnAdd)){
                
                    st.executeUpdate("INSERT INTO `salesstaff`(`name`, `surname`, `telNum`) VALUES ('" +txtEmpName.getText() +  "' ,'"
                            + txtEmpSurname.getText() + "', '" + txtEmpTelNum.getText() + "')");
                    rs = st.executeQuery("SELECT * FROM salesstaff");
                    rs.last();
                    JOptionPane.showMessageDialog(null, "Employee name: " + rs.getString("name")
                            + "\nEmployee surname: " + rs.getString("surname")
                            + "\nEmployee telepone Number: " + rs.getString("telNum")
                            + "\nEmployee number: " + rs.getString("empNum"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Test3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
