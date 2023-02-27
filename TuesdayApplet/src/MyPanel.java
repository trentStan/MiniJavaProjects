
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class MyPanel extends JPanel{
    public void paintComponent(Graphics g)
    {  
      // g.fillOval(40, 40, 200, 50);
       
       //g.drawLine(30, 30, 120, 30);
       g.setColor(Color.blue);
      // g.drawLine(30, 40, 300, 200);
       
       
       g.setColor(Color.red);
       for(int count = 1; count <= 100; count++){
           g.drawLine(0, 0, count * 200 / 100, 100);
       }
       g.setColor(Color.blue);
       g.fillOval(-50, -50, 100, 100);
       
       
       g.setColor(Color.BLACK);
       g.fillOval(100, 100, 100, 100);
       
      
       g.fillArc(80, 110, 80, 30, 245, -150);
       g.fillArc(140, 110, 80, 30, -65, 150);
        g.setColor(Color.WHITE);
        g.fillRoundRect(110, 40, 80, 60, 3, 3);
        g.fillRect(50, 100, 200, 10);
       g.drawOval(120, 120, 10, 10);
       g.drawOval(160, 120, 10, 10);
       
       g.drawLine(145, 130, 145, 150);
       g.drawArc(120, 155, 40, 20, 180, 180);
       
       g.drawArc(75, 200, 25, 25, 0, 90);
       
    }
}
