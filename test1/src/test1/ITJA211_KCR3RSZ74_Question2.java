/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itja211_kcr3rsz74_question2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author tohee
 */
public class ITJA211_KCR3RSZ74_Question2 extends JFrame implements ActionListener {

    Connection conn;
    JFrame frame = new JFrame();
    JPanel colorPanel = new JPanel();
    JPanel interfacePanel = new JPanel();
    JPanel inputPanel = new JPanel();
    JPanel btnPanel = new JPanel();
    JPanel imagePanel = new JPanel();
    JLabel lblName = new JLabel("Customer Name:");
    JTextField txtName = new JTextField();
    JLabel lblSurname = new JLabel("Customer Surname:");
    JTextField txtSurname = new JTextField();
    JLabel lblTelNum = new JLabel("Customer telephone number:");
    JTextField txtTelNum = new JTextField();
    JLabel lblAddress = new JLabel("Customer address:");
    JTextField txtAddress = new JTextField();
    JButton btnAdd = new JButton("Add Record");
    JButton btnSearch = new JButton("Search for Record");
    JButton btnUpdate = new JButton("Update the Records");
    JLabel icon = new JLabel();

    public ITJA211_KCR3RSZ74_Question2() throws IOException {

        setTitle("ENS Customer Program");
        colorPanel.setBackground(Color.BLUE);
        interfacePanel.setLayout(new GridLayout(3, 1));
        BufferedImage picture = ImageIO.read(new File("logo.jpg"));

        setIconImage(picture);

        lblName.setHorizontalAlignment(SwingConstants.CENTER);
        lblSurname.setHorizontalAlignment(SwingConstants.CENTER);
        lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
        lblTelNum.setHorizontalAlignment(SwingConstants.CENTER);

        icon = new JLabel(new ImageIcon(picture));
        icon.setVerticalAlignment(SwingConstants.TOP);

        inputPanel.setLayout(new GridLayout(8, 1));
        inputPanel.add(lblName);
        inputPanel.add(txtName);
        inputPanel.add(lblSurname);
        inputPanel.add(txtSurname);
        inputPanel.add(lblTelNum);
        inputPanel.add(txtTelNum);
        inputPanel.add(lblAddress);
        inputPanel.add(txtAddress);

        btnAdd.setToolTipText("Add information to database");
        btnSearch.setToolTipText("Search for a record using name and surname");
        btnUpdate.setToolTipText("Update the details in the record");
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
        conn = DriverManager.getConnection("jdbc:mysql://localhost/ens", "root", "");
        System.out.println("Connection: " + conn);
    }

    public static void main(String[] args) throws IOException {
        new ITJA211_KCR3RSZ74_Question2();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        try {
            Object ae = arg0.getSource();
            String name = "", surname = "", telNum = "", address = "";

            Statement st = conn.createStatement();

            if (ae.equals(btnAdd)) {

                st.executeUpdate("INSERT INTO `customersDetails` VALUES ('" + txtName.getText() + "','" + txtSurname.getText() + "','" + txtTelNum.getText() + "','" + txtAddress.getText() + "');");
                JOptionPane.showMessageDialog(null, "The record was added successfully");
            } else if (ae.equals(btnSearch)) {
                ResultSet searchRs = st.executeQuery("SELECT telNum, address FROM customersdetails "
                        + "WHERE name = '" + txtName.getText() + "'AND" + " surname = '" + txtSurname.getText() + "'");
                searchRs.next();
                txtTelNum.setText(searchRs.getString("telNumber"));
                txtAddress.setText(searchRs.getString("address"));

                name = txtName.getText();
                surname = txtSurname.getText();
                telNum = txtTelNum.getText();
                address = txtAddress.getText();

                JOptionPane.showMessageDialog(null, "Update the required records and click on the update records button if necessary");
            } else if (ae.equals(btnUpdate)) {
                String sql = "UPDATE `customersDetails` SET `name` = '" + txtName.getText() + "',`surname` ='" + txtSurname.getText() + "',`telNum` ='" + txtTelNum.getText()
                        + "',`address` ='" + txtAddress.getText() + "' WHERE `name` = '" + name + "' AND `surname` = '" + surname + "' AND `telNum` ='" + telNum + "' AND `address` ='" + address + "'";
                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "The record has been successfully updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ITJA211_KCR3RSZ74_Question2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
