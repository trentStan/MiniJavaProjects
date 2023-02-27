/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itja211_lmqf353s5_1;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lmqf353s5
 */
public class ITJA211_LMQF353S5_1 extends JFrame implements ActionListener {

    Connection conn;
    JPanel inputPanel = new JPanel();                           //panel for entering values
    JLabel nameLabel = new JLabel("Username:");                 //username label
    JTextField nameField = new JTextField();                    //username text field

    JLabel passwordLabel = new JLabel("Password:");             //password label
    JPasswordField passwordField = new JPasswordField();     //password field
    JButton login = new JButton("Login");            //login button

    public ITJA211_LMQF353S5_1() throws ClassNotFoundException, SQLException {
        dbConnection();                                     // connecting to the database
        setTitle("ENS Login System");                       // Setting the Frame title
        inputPanel.setLayout(new GridLayout(2, 2));         // Set the layout of the input panel
        inputPanel.add(nameLabel);                          // label and text field components are added in order
        inputPanel.add(nameField);                          
        passwordField.setEchoChar('\u25CF');                // password masking
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);
        login.addActionListener(this);                      // the login button is assigned a listener

        add(inputPanel);                                    // add panel to frame
        add(login);                                         // add login button to frame
        setLayout(new GridLayout(3, 1));                    // setting the frame layout
        setSize(300, 200);                                  // size of frame is set
        setResizable(false);                                // user cannot resize the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void dbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");                                 // this loads the mySql connector
        conn = DriverManager.getConnection("jdbc:mysql://localhost/Accounts", "root", "");   // this establishes a connection to the database
        System.out.println("Connection " + conn);                                       // to verify the connection
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new ITJA211_LMQF353S5_1();                  // a new instance
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ae = e.getSource();     
        if (ae.equals(login)) {          // if login button is clicked
            try {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT username, password FROM useraccount WHERE username = '" + nameField.getText() + "'");  // retrieve data from table useraccount
                
                while (rs.next()) {
                    if (rs.getString("username").equals(nameField.getText()) && rs.getString("password").equals(passwordField.getText())) {    // if username and password are correct
                        JOptionPane.showMessageDialog(null, "Hi " + nameField.getText() + " you have successfully logged in.");   // display access is granted
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Login failed");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(ITJA211_LMQF353S5_1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
