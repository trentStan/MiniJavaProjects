
import java.awt.*;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user-pc
 */
public class MyPanel extends JPanel {

    public void paintComponent(Graphics g) {
        
      /*  
        g.setColor(Color.BLACK);
        g.drawRect(50, 50, 200, 66);
        g.drawString("User", 135, 90);

        g.drawRect(600, 50, 200, 66);
        g.drawString("Developer Administrator", 640, 90);

        g.drawOval(350, 20, 150, 150);
        g.drawString("Administrator", 390, 95);
        
        g.drawLine(250, 70, 360, 60);
        g.drawLine(250, 110, 360, 130);
        
        g.drawLine(490, 60, 600, 65);
        g.drawLine(490, 130, 600, 100);
        
        g.drawString("Provides information on missing persons", 150, 40);
        g.drawString("Provides information and ongoing", 190, 160);
        g.drawString("Receives requests from Administrator", 490, 40);
        g.drawString("Provides privileges and creates new users", 500, 150);
        */
        
        g.setColor(Color.BLACK);
        g.drawRect(100, 100, 200, 66);
        g.drawString("User", 185, 140);

        g.drawRect(650, 100, 200, 66);
        g.drawString("Developer Administrator", 690, 140);

        g.drawOval(400, 70, 150, 150);
        g.drawString("Administrator", 440, 145);
        
        g.drawLine(300, 120, 410, 110);
        g.drawLine(300, 160, 400, 160);
        
        g.drawLine(540, 110, 650, 115);
        g.drawLine(550, 150, 650, 150);
        
        g.drawString("Provides information on missing persons", 175, 90);
        g.drawString("Provides information and ongoing", 215, 210);
        g.drawString("Receives requests from Administrator", 560, 90);
        g.drawString("Provides privileges and creates new users", 570, 200);
    }
}
