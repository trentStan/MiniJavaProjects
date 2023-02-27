/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday3;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LMQF353S5
 */
public class Tuesday3 {

    Connection conn;
    Statement st;
    String name, surname, age;

    public Tuesday3() throws ClassNotFoundException, SQLException {
        DBConnection();
        enterDetails();
        moveDetails();
    }

    public void DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
        System.out.println("Connection: " + conn);
        st = conn.createStatement();
    }

    public void enterDetails() throws SQLException {
        name = JOptionPane.showInputDialog("enter name");
        surname = JOptionPane.showInputDialog("Enter Surname");
        age = JOptionPane.showInputDialog("Enter age");
        
    }

    public void moveDetails() throws SQLException {
        st.executeUpdate("INSERT INTO `test`.`details` (`name`, `surname`, `age`) VALUES ('" + name + "', '" + surname + "', '" + age + "')");
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new Tuesday3();
    }

}
