
package GUI.z;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drow_box{
    
     
    public static void main(String[] args) {
       
      JFrame f = new JFrame("Drow A Box");
            f.setVisible(true);
            f.setSize(800, 600);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
      
      Drow d = new Drow();
        f.add(d);
      
      
      
    }
    
   
}

class Drow extends JPanel{

        public void paintComponent(Graphics g){
        
            //super.paintComponents(g);
            
            g.setColor(Color.red);
            
            g.fillArc(40, 40, 200, 200, 30, 180);
           
            
    
        }
 
        
}