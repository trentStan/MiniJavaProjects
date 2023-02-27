/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetting;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author user-pc
 */
public class TestVetting {

    Connection conn;
    Statement st;
    int[][] rates = new int[5][5];
    Scanner input = new Scanner(System.in);

    public void dbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/assessment", "root", "");
        System.out.println("Connection: " + conn);
        insertToDatabase();
    }

    public void insertToDatabase() throws SQLException {
        enterRates();
        st = conn.createStatement();
        st.executeUpdate("DELETE FROM `lecturer`");

        for (int count = 0; count < 5; count++) {
            st.execute("INSERT INTO lecturer VALUES (" + (count + 1) + "," + rates[count][0] + ","
                    + rates[count][1] + "," + rates[count][2] + "," + rates[count][3] + "," + rates[count][4] + ")");
        }
    }

    public void enterRates() {

        System.out.println("Enter ratings for assessments 1 to 5 out of 10");
        for (int outCount = 0; outCount < 5; outCount++) {
            System.out.println("Student " + (outCount + 1));

            for (int inCount = 0; inCount < 5; inCount++) {
                System.out.print("  assessment " + (inCount + 1) + ": ");
                rates[outCount][inCount] = input.nextInt();

                while (rates[outCount][inCount] > 10 || rates[outCount][inCount] < 0) {
                    System.out.println("re-enter rating between 0 and 10");
                    rates[outCount][inCount] = input.nextInt();
                }
            }
        }
    }

    public void show() throws ClassNotFoundException, SQLException {
        dbConnection();
        Vetting vet = new Vetting("Ms Makhurane", rates);
        vet.outputRates();
        vet.processRates();

        System.out.println("\nDatabase:\n");
        ResultSet rs = st.executeQuery("SELECT * FROM `lecturer`");

        System.out.printf("%-10s%-15s%-15s%-15s%-15s%-35s\n", "Student", "Assessment 1", "Assessment 2",
                "Assessment 3", "Assessment 4", "Assessment 5");
        while (rs.next()) {
            System.out.printf("%-10s%-15s%-15s%-15s%-15s%-35s\n", rs.getString("Student"), rs.getString("ass1"),
                     rs.getString("ass2"), rs.getString("ass3"), rs.getString("ass4"), rs.getString("ass5"));
        }

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        new TestVetting().show();
    }

}
