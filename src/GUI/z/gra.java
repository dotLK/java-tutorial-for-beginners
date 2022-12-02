
package GUI.z;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.Timer;

public class gra extends JPanel implements ActionListener{

    Timer tm = new Timer(5, this);
    
    int x=0, velx=2 ;
    
    
    
    
    @Override
    public void paintComponent(Graphics g){
    
      /*  super.paintComponent(g);
        g.setColor(Color.CYAN);        
        g.fillRect(x+20, 5, 60, 20);
        g.setColor(Color.RED);
        g.fillRect(x+20, 20, 150, 30);
        g.drawOval(x+40, 40, 30, 30);
        g.drawOval(x+120, 40, 30, 30);
        tm.start();
*/
        super.paintComponent(g);        
        g.setColor(Color.RED);
        g.fillRect(x, x, 150, 30);
        
        tm.start();
        
    }
   public void actionPerformed(ActionEvent e){
   
     /*  
       x = x + velx ;       
       repaint();
     */
     
       if (x<0 || x>600){
           
           velx = -velx;
       }   
       x = x + velx ;
       
       repaint();
       
      
   }
    
    public static void main(String[] args) {
        
     
        
        gra a = new gra();
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(600, 600);
        f.setTitle("My Form");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);        
        f.add(a);

     }
    
}
