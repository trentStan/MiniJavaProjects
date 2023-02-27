/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author LMQF353S5
 */
public class DbConnection extends JFrame implements ActionListener {

    JTextField txtname = new JTextField();
    JComboBox jld = new JComboBox();
    JButton enter = new JButton("Enter");

    public DbConnection() {
        JLabel lblName = new JLabel("Name");
        setSize(400, 400);
        JLabel lblid = new JLabel("Identity Number");
        setLayout(new GridLayout(3, 2));
        JPanel panel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(lblid);
        panel.add(jld);
        panel.add(lblName);
        panel.add(txtname);
        panel.add(enter);
        add(panel);
        enter.addActionListener(this);
        txtname.addActionListener(jld);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DbConnection();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        try {
            if (source.equals(enter)) {

                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
                System.out.println("Connection " + conn);

                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT `Id`, `Name` FROM `test`");
                
                while(rs.next()){
                    jld.addItem(rs.getString("Id"));
                    txtname.setText(rs.getString("name"));
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
