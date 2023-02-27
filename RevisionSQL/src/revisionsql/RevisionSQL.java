/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionsql;

import java.sql.*;

/**
 *
 * @author LMQF353S5
 */
public class RevisionSQL {
    
    Connection conn;
    private String name;
    private String ID;
    private int age;
    
    
    
    public void DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/test" , "root" , "");
        System.out.println("Connection: " + conn);
          
    }
    
    public void Display() throws SQLException, ClassNotFoundException{
        DBConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT id, name, age FROM test");
        while(rs.next()){
        System.out.print("ID: "  + rs.getString(1));
        System.out.print(" ,Name: " + rs.getString(2));
           System.out.println(" ,Age: " + rs.getString(3));
        }
       // st.executeUpdate("INSERT INTO `test` (`Id`, `Name`, `age`) VALUES ('id1', '', '13'");
        
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new RevisionSQL().Display();
    }
    
}
