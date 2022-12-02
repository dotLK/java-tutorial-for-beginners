
package GUI;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {

  
    public static void main(String[] args) {
       
        JFrame main = new JFrame();
        
        main.setVisible(true);
        
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setSize(500, 500);
        main.setTitle("My Java Frame");
        main.setLocationRelativeTo(null);
       
        JPanel p1 = new JPanel();
        p1.setBackground(Color.red);
        
        main.add(p1);
        
    }
    
}
