/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author LMQF353S5
 */
public class Person extends JFrame implements ActionListener {

    private int num1, num2 = 69, answer;
    private int age;
    private double height;
    JPanel panel = new JPanel();
    JLabel labName = new JLabel("Name:");
    JTextField txtNum1 = new JTextField(10);
    JLabel labSurname = new JLabel("Surname:");
    JTextField txtNum2 = new JTextField(10);
    JLabel labAge = new JLabel("Age:");
    JTextField txtAge = new JTextField(10);
    JTextField txtHeight = new JTextField(10);
    JLabel labHeight = new JLabel("Height:");
    JButton addButt = new JButton("Add");
    JButton remButt = new JButton("Cancel");
    JLabel answerLab = new JLabel("Answer:");
    JTextField answerTxt = new JTextField();
    private BufferedImage insect; 
    
    
    public Person(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(6, 2));
        panel.add(labName);
        panel.add(txtNum1);
        panel.add(labSurname);
        panel.add(txtNum2);
        panel.add(labAge);
        panel.add(txtAge);
        panel.add(labHeight);
        panel.add(txtHeight);
        
        add(panel);

        addButt.addActionListener(this);
        addButt.setSize(1, 2);
        panel.add(addButt);
        panel.add(remButt);
        panel.add(answerLab);
        panel.add(answerTxt);
        
        setSize(500, 500);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        Person person = new Person("Person");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ae = e.getSource();
        if (ae.equals(addButt)) {
            setTitle(txtNum1.getText());
            this.num1 = Integer.parseInt(txtNum1.getText());
            answer = num1  + num2;
            answerTxt.setText(Integer.toString(answer));
            insect = ImageIO.read(new File(new JFileChooser()));
        }
    }

}
