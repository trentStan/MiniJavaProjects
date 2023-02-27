/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstconnection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author LMQF353S5
 */
public class MyFirstConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
     /*   String filename = new File("DB.accdb").getAbsolutePath();
        Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + filename);
        String[] name = new String[5];
        
        System.out.println("Connection" + conn);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select `id`, `name` FROM `Table`");
        while(rs.next()){
            System.out.print(rs.getString("ID") + ": ");
            System.out.println(rs.getString("Name"));
        }*/
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
        System.out.println("Connection " + conn);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT `Id`, `Name` FROM `test`");
        
        while(rs.next()){
            System.out.print(rs.getString("Id") + ": ");
            System.out.println(rs.getString("Name") + "");
        }
    }
    
}
