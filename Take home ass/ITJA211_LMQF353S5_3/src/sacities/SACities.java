/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacities;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
public class SACities extends JFrame implements ActionListener {

    Connection conn;
    Statement st;
    JPanel selectPanel = new JPanel();

    JScrollPane sp = new JScrollPane();
    JMenuBar mb = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem exitItem = new JMenuItem("Exit");
    JMenu helpMenu = new JMenu("Help");
    JMenuItem aboutItem = new JMenuItem("About");

    JLabel lblCities = new JLabel("Cities");
    JComboBox cb = new JComboBox();
    JButton btnGetAttract = new JButton("Get Attraction");
    JTable table;

    public SACities(String title) throws HeadlessException, ClassNotFoundException, SQLException {
        super(title);
        dbConnection();
        mb.add(fileMenu);
        mb.add(helpMenu);
        fileMenu.add(exitItem);
        exitItem.addActionListener(this);
        helpMenu.add(aboutItem);
        aboutItem.addActionListener(this);

        lblCities.setHorizontalAlignment(JLabel.CENTER);
        btnGetAttract.addActionListener(this);
        fillComboBox();

        table = new JTable(new String[15][1], new String[]{"TouristAttraction"});
        sp.setViewportView(table);

        setLayout(new GridLayout(2, 1));
        this.setJMenuBar(mb);
        selectPanel.setLayout(new GridLayout(3, 1));

        selectPanel.add(lblCities);
        selectPanel.add(cb);
        selectPanel.add(btnGetAttract);

        add(selectPanel);
        add(sp);

        this.setSize(300, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void dbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/sacities", "root", "");
        System.out.println("Connection: " + conn);
    }

    public void fillComboBox() throws SQLException {
        st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT `city_name` FROM `cities`");

        while (rs.next()) {
            cb.addItem(rs.getString("city_name"));
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new SACities("SA Cities");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ae = e.getSource();

        if (ae.equals(exitItem)) {
            System.exit(0);
        }

        if (ae.equals(aboutItem)) {
            JOptionPane.showMessageDialog(null, "This program was developed by Trent Stanley\n12 June 2020");
        }

        if (ae.equals(btnGetAttract)) {
            try {
                ResultSet rs = st.executeQuery("SELECT attraction FROM attractions, cities, citiesattractions WHERE attractions.attraction_id = citiesattractions.attraction_id "
                        + "AND cities.city_id = citiesattractions.city_id AND city_name = '" + cb.getSelectedItem() + "';");

                int count = 0;
                while (rs.next()) {
                    table.setValueAt(rs.getString("attraction"), count, 0);
                    count++;
                }

            } catch (SQLException ex) {
                Logger.getLogger(SACities.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
