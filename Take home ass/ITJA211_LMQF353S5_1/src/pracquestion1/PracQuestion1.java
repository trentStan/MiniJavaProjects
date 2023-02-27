/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracquestion1;

import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author user-pc
 */
public class PracQuestion1 extends JFrame {

    JMenuBar mb = new JMenuBar();
    JMenu mainMenu = new JMenu("Main Menu");
    JMenuItem newProjItem = new JMenuItem("New Project");
    JMenu openProjMenu = new JMenu("Open Project");
    JMenuItem proj1 = new JMenuItem("Project 1");
    JMenuItem proj2 = new JMenuItem("Project 2");
    JMenuItem proj3 = new JMenuItem("Project 3");

    public PracQuestion1(String title) throws HeadlessException {
        super(title);
        openProjMenu.add(proj1);
        openProjMenu.add(proj2);
        openProjMenu.add(proj3);

        mainMenu.add(newProjItem);
        mainMenu.add(openProjMenu);

        mb.add(mainMenu);
        this.setJMenuBar(mb);
        this.setSize(200, 100);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PracQuestion1("PracQuestion1");
    }

}
