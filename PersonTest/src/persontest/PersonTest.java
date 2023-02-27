/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persontest;


import java.sql.*;

/**
 *
 * @author user-pc
 */
public class PersonTest {
    
    Connection conn;
    
    public void DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/shopping", "root", "");
        System.out.println(conn);
    }

    public PersonTest() throws ClassNotFoundException, SQLException {
        this.DBConnection();
        this.DBSelect();
        this.DBInsert();
        this.DBSelect();
    }
    
    public void DBInsert() throws SQLException{
        String sql = "INSERT INTO `details`(`name`, `surname`, `age`, `amount`) "
                + "VALUES (?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        
        st.setString(1, "Ndai");
        st.setString(2, "Mapaso");
        st.setInt(3, 21);
        st.setInt(4, 4000);
        st.execute();
        
        
    }
    
    public void DBSelect() throws SQLException{
       String sql = "SELECT * FROM `details`";
        PreparedStatement st = conn.prepareStatement(sql); 
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            System.out.print("Name: " + rs.getString("name"));
            System.out.print(" surname: " + rs.getString("surname"));
            System.out.print(" age: " + rs.getString("age"));
            System.out.println(" amount: " + rs.getString("amount"));
            
        }
        System.out.println("");
    }
    
    public void DBDelete(){
        
    }
    
    public void DBUpdate(){
        
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new PersonTest();
    }
    
}
