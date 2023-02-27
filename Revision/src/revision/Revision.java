/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author LMQF353S5
 */
public class Revision {

    

    public Revision() throws FileNotFoundException, SQLException, ClassNotFoundException {
       /* Scanner File = new Scanner(new File("details.txt"));
        String filename = new File("details.accdb").getAbsolutePath();
        Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + filename);
        System.out.println("Connection: " + conn);
        
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT ");
       */
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/");
        
    }
    
    
    public static void main(String[] args) throws FileNotFoundException, SQLException, ClassNotFoundException {
        new Revision();
    }
    
}
