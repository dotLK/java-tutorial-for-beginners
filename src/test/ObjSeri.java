
package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjSeri {

    public static void main(String[] args)  {
        
        
        
        
        try {
            
        File fi = new File("Student.txt");
        ArrayList<Student> sut = new ArrayList<Student>();
        sut.add(new Student(1,"baby"));
        sut.add(new Student(1,"sasindu"));
        sut.add(new Student(1,"umesh"));
        
        FileOutputStream fo = new FileOutputStream(fi);
        ObjectOutputStream ob = new ObjectOutputStream(fo);
        
       
        for(Student s : sut){
            ob.writeObject(ob);
        }
         ob.close();
         fo.close();
            
        } catch (IOException e) {
            System.out.println(e);
        }
  /*      
        try {
            
            FileInputStream in = new FileInputStream("Student.txt");
            ObjectInputStream ob =  new ObjectInputStream(in);
            ArrayList<Student> sut1 = new ArrayList();
            
            while (true) {                
                Student s = (Student) ob.readObject();
                sut1.add(s);
                System.out.println(s);
            }
            
            
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        
        */
    }
    
}

