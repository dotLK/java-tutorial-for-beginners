package zgood;

import java.applet.*;
import java.awt.*;
import javax.swing.JFrame;
/*
  <applet code="BackgroundForeground" width=200 height=200>
  </applet>
*/

public class BackgroundForeground extends JFrame {
    public static void main(String[] args) {
        
       BackgroundForeground bg= new BackgroundForeground();
        bg.setVisible(true);
        bg.setTitle("My Cal");
        bg.setSize(300, 400);
        bg.setBackground(Color.yellow);
    bg.setForeground(Color.blue);
    }
  public void paint(Graphics g) {
    
    g.drawLine(0, 0, 200, 200);
    g.fillRect(100, 40, 50, 50);
  }
}