/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queston7;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author user-pc
 */
public class Queston7 extends JFrame implements ActionListener {

    Connection conn;
    Statement st;
    ResultSet rs;

    JMenuBar mb = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu helpMenu = new JMenu("Help");
    JMenuItem exitItem = new JMenuItem("Exit");
    JMenuItem aboutItem = new JMenuItem("About");

    JLabel lblHeader = new JLabel("Books");

    JPanel inputPanel = new JPanel();
    JPanel btnPanel = new JPanel();

    JLabel lblTitle = new JLabel("Title:");
    JTextField txtTitle = new JTextField();
    JLabel lblAuthor = new JLabel("Author:");
    JTextField txtAuthor = new JTextField();
    JLabel lblPubYear = new JLabel("Publication Year:");
    JTextField txtPubYear = new JTextField();
    JLabel lblPublisher = new JLabel("Publisher:");
    JTextField txtPublisher = new JTextField();

    JButton btnPrev = new JButton("<< Previous");
    JButton btnNext = new JButton("Next >>");

    public Queston7() throws HeadlessException, ClassNotFoundException, SQLException {
        dbConnection();
        firstRecord();
        setTitle("BookShop");

        setLayout(new GridLayout(3, 1));

        mb.add(fileMenu);
        mb.add(helpMenu);
        fileMenu.add(exitItem);
        helpMenu.add(aboutItem);
        exitItem.addActionListener(this);
        aboutItem.addActionListener(this);

        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(lblTitle);
        inputPanel.add(txtTitle);
        inputPanel.add(lblAuthor);
        inputPanel.add(txtAuthor);
        inputPanel.add(lblPubYear);
        inputPanel.add(txtPubYear);
        inputPanel.add(lblPublisher);
        inputPanel.add(txtPublisher);

        btnPanel.setLayout(new GridLayout(1, 2, 100, 200));
        btnPanel.add(btnPrev);
        btnPanel.add(btnNext);
        btnNext.addActionListener(this);
        btnPrev.addActionListener(this);

        lblHeader.setHorizontalAlignment(JLabel.CENTER);

        add(lblHeader);
        add(inputPanel);
        add(btnPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(mb);
        setSize(400, 350);
        setResizable(false);
        setVisible(true);
    }

    public void dbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
        System.out.println("Connection: " + conn);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new Queston7();
    }

    public void firstRecord() throws SQLException {
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM book");

        rs.next();
        txtTitle.setText(rs.getString("title"));
        txtAuthor.setText(rs.getString("author"));
        txtPubYear.setText(rs.getString("pubYear"));
        txtPublisher.setText(rs.getString("publisher"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ae = e.getSource();

        if (ae.equals(exitItem)) {
            System.exit(1);
        }
        if (ae.equals(aboutItem)) {
            JOptionPane.showMessageDialog(null, "Programmer name: Trent Stanley\n"
                    + "Date created: 6 May 2020");
        }

        if (ae.equals(btnNext)) {
            try {
                if (rs.isLast()) {
                    rs.first();
                    txtTitle.setText(rs.getString("title"));
                    txtAuthor.setText(rs.getString("author"));
                    txtPubYear.setText(rs.getString("pubYear"));
                    txtPublisher.setText(rs.getString("publisher"));
                } else {
                    rs.next();
                    txtTitle.setText(rs.getString("title"));
                    txtAuthor.setText(rs.getString("author"));
                    txtPubYear.setText(rs.getString("pubYear"));
                    txtPublisher.setText(rs.getString("publisher"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Queston7.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (ae.equals(btnPrev)) {
            try {
                if (rs.isFirst()) {
                    rs.last();
                    txtTitle.setText(rs.getString("title"));
                    txtAuthor.setText(rs.getString("author"));
                    txtPubYear.setText(rs.getString("pubYear"));
                    txtPublisher.setText(rs.getString("publisher"));
                } else {
                    rs.previous();
                    txtTitle.setText(rs.getString("title"));
                    txtAuthor.setText(rs.getString("author"));
                    txtPubYear.setText(rs.getString("pubYear"));
                    txtPublisher.setText(rs.getString("publisher"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Queston7.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
