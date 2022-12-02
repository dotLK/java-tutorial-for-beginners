
package GUI.z;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class JavaGame extends JFrame{

    int x ,y ;
   
   public class AL extends KeyAdapter {
   
       public void keyPressed(KeyEvent e){
       int keyCode = e.getKeyCode();
       
        if(keyCode ==e.VK_LEFT){
            --x;
            System.out.println("i");
        }
        if(keyCode ==e.VK_RIGHT){
            ++x;
        }
        if(keyCode ==e.VK_UP){
            y--;
        }
        if(keyCode ==e.VK_DOWN){
            y++;
        }
       
       }
       public void keyRelesed(KeyEvent e){
       
       
       }
   }
   
   
   
    public  JavaGame(){
    
    addKeyListener(new AL());
    
    setSize(600, 600);
    setTitle("My Form");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    
    x = 10;
    y=150;
    
    }
    
    public void paint(Graphics g){
        
        g.setColor(Color.RED);
        g.fillOval(x, y, 20, 20);
        repaint();
    
    }
    
     public static void main(String[] args) {
       
         new JavaGame().setVisible(true);
    }
}
