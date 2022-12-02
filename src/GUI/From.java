
package GUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class From {

    public static void main(String[] args) {
        
        Formgui f = new Formgui();
        
        
    }
    
}


class Formgui extends JFrame{

            JTextField t ;
            JRadioButton o ,m ,f ;
            JButton b;
            JLabel l;
            JComboBox cm ;
    
    public Formgui(){
    
       
        
        t =new JTextField(15);
        o = new JRadioButton("Other",true);
        m = new JRadioButton("Male");
        f = new JRadioButton("Female");
        b = new JButton("Ok");
        l = new JLabel("Answer");
        l.setFont(new Font("", 0, 30));
        String [] name = {"Kumara","Bandra","Sampath"};
        
        cm =  new JComboBox(name);
        
        
        ButtonGroup gr = new ButtonGroup();
        gr.add(o);
        gr.add(m);
        gr.add(f);
        
        
        add(o);
        add(m);
        add(f);
        add(t);
        add(cm);
        add(b);
        add(l);
        
        setVisible(true);
        setSize(400, 400);
        setTitle("My Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
    b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
              String name = t.getText();
              
              String md = cm.getSelectedItem().toString();
              
           if(name.equals("")){
           
           JOptionPane.showMessageDialog(null, "Pls Enter Your Name");
            l.setText("Pls Enter Your Name");
            
           } else{
           
            if(f.isSelected()){
                  
                    l.setText("Ms. "+name+" "+md);
                    JOptionPane.showMessageDialog(null, "Ms." + name+" "+md);
                
              }else if(m.isSelected()){
                  
                    l.setText("Mr. "+name+" "+md);
                    JOptionPane.showMessageDialog(null, "Mr." + name+" "+md);
              }
              
              else{
                   l.setText("?? "+name+" "+md);
                   JOptionPane.showMessageDialog(null, "?? "+name+" "+md);
              
              }
           
           }  
             
              
                
                
            }
        });
        
    }

}

