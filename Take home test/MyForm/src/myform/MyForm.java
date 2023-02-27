/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myform;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author user-pc
 */
public class MyForm extends JFrame implements ActionListener {

    JTextField txtBox = new JTextField();
    JButton btn = new JButton("Enter");

    public MyForm() {
        setLayout(new GridLayout(2, 1));

        btn.addActionListener(this);

        add(txtBox);
        add(btn);
        setResizable(false);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ae = e.getSource();

        if (ae.equals(btn)) {
            if (txtBox.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "TextField is blank", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(rootPane, txtBox.getText());
            }
        }
    }

}
