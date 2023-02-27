/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydatabase;


import java.sql.*;

/**
 *
 * @author LMQF353S5
 */
public class MyDatabase {

    private Connection conn;
    private Statement st;
    public void dbConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
        System.out.println("Connection: " + conn);
        st = conn.createStatement();
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new MyDatabase().dbConnection();
    }

    
    
}
