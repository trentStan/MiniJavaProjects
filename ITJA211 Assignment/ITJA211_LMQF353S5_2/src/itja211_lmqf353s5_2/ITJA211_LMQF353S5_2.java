/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itja211_lmqf353s5_2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.paint.Color.color;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author user-pc
 */
public class ITJA211_LMQF353S5_2 extends JFrame implements ActionListener {

    Connection conn;
    JFrame frame = new JFrame();
    JPanel colorPanel = new JPanel();
    JPanel interfacePanel = new JPanel();
    JPanel inputPanel = new JPanel();
    JPanel btnPanel = new JPanel();
    JPanel imagePanel = new JPanel();
    
    JLabel labName = new JLabel("Customer Name:");
    JTextField txtName = new JTextField();
    JLabel labSurname = new JLabel("Customer Surname:");
    JTextField txtSurname = new JTextField();
    JLabel labTelNumber = new JLabel("Customer telephone number:");
    JTextField txtTelNumber = new JTextField();
    JLabel labAddress = new JLabel("Customer address:");
    JTextField txtAddress = new JTextField();
    
    JButton btnAdd = new JButton("Add Record");
    JButton btnSearch = new JButton("Search for Record");
    JButton btnUpdate = new JButton("Update the Records");
    
    JLabel icon = new JLabel();

    public ITJA211_LMQF353S5_2() throws IOException, ClassNotFoundException, SQLException {
        DBConnection();
        setTitle("ENS Customer Program");
        BufferedImage image = ImageIO.read(new File("logo.jpg"));

        setIconImage(image);

        interfacePanel.setLayout(new GridLayout(3, 1));
        colorPanel.setBackground(Color.BLUE);

        labName.setHorizontalAlignment(SwingConstants.CENTER);
        labSurname.setHorizontalAlignment(SwingConstants.CENTER);
        labAddress.setHorizontalAlignment(SwingConstants.CENTER);
        labTelNumber.setHorizontalAlignment(SwingConstants.CENTER);

        icon = new JLabel(new ImageIcon(image));
        icon.setVerticalAlignment(SwingConstants.TOP);

        inputPanel.setLayout(new GridLayout(8, 1));
        inputPanel.add(labName);
        inputPanel.add(txtName);
        inputPanel.add(labSurname);
        inputPanel.add(txtSurname);
        inputPanel.add(labTelNumber);
        inputPanel.add(txtTelNumber);
        inputPanel.add(labAddress);
        inputPanel.add(txtAddress);

        btnAdd.setToolTipText("Add the information entered into the database");
        btnSearch.setToolTipText("Search for the record using name and surname");
        btnUpdate.setToolTipText("Update your details");
        btnAdd.addActionListener(this);
        btnSearch.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnPanel.add(btnAdd);
        btnPanel.add(btnSearch);
        btnPanel.add(btnUpdate);

        interfacePanel.add(inputPanel);
        interfacePanel.add(btnPanel);
        interfacePanel.add(icon);

        add(interfacePanel);
        add(colorPanel);
        setLayout(new GridLayout(1, 2));
        setResizable(false);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/ENS_Customer", "root", "");
        System.out.println("Connection: " + conn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Object ae = e.getSource();
            String name = "", surname = "", telNumber = "", address = "";

            Statement st = conn.createStatement();

            if (ae.equals(btnAdd)) {

                st.executeUpdate("INSERT INTO `customerdetails` VALUES ('" + txtName.getText() + "','" + txtSurname.getText() + "','" + txtTelNumber.getText() + "','" + txtAddress.getText() + "');");
                JOptionPane.showMessageDialog(null, "The record was added successfully");
                name = txtName.getText();
                surname = txtSurname.getText();
                telNumber = txtTelNumber.getText();
                address = txtAddress.getText();
            } else if (ae.equals(btnSearch)) {
                ResultSet searchRs = st.executeQuery("SELECT telNumber, address FROM customerdetails "
                        + "WHERE name = '" + txtName.getText() + "'AND" + " surname = '" + txtSurname.getText() + "'");
                searchRs.next();
                txtTelNumber.setText(searchRs.getString("telNumber"));
                txtAddress.setText(searchRs.getString("address"));

                name = txtName.getText();
                surname = txtSurname.getText();
                telNumber = txtTelNumber.getText();
                address = txtAddress.getText();

                JOptionPane.showMessageDialog(null, "Update the required records and click on the update records button if necessary");
            } else if (ae.equals(btnUpdate)) {
                String sql = "UPDATE `customerdetails` SET `name` = '" + txtName.getText() + "',`surname` ='" + txtSurname.getText() + "',`telNumber` ='" + txtTelNumber.getText()
                        + "',`address` ='" + txtAddress.getText() + "' WHERE `name` = '" + name + "' AND `surname` = '" + surname + "' AND `telNumber` ='" + telNumber + "' AND `address` ='" + address + "'";
                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "The record has been successfully updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ITJA211_LMQF353S5_2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        new ITJA211_LMQF353S5_2();
    }

}
