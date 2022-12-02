
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class fileio {  // basic file write and read

    public static void main(String[] args) {
         
    //--Java Create and Write To Files    
        try {
            File fi =  new File("Create.txt");
            fi.createNewFile();        
                 
            System.out.println(fi.getAbsolutePath());
         
            //   fi.delete(); // Delete a File
         
        } catch (Exception e) {
            
             System.out.println(e);
        }
 //--------------------------------------------------        
 // Write file 
   
    try {
           
        File fi =  new File("Write.txt");
            PrintWriter out = new PrintWriter(fi);
                out.println("Sasindu");
                out.println("32");
                out.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
   try {
      FileWriter myWriter = new FileWriter("text_write.txt");
        
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      
      myWriter.close();
      
    } catch (Exception e) {
        System.out.println(e);
    
    }
 //-------------------------------------------------
     
    // Read file line by line
        try {
            File fi =  new File("Write.txt"); 
            Scanner inp = new Scanner(fi);
                String name  =inp.nextLine();
                int age = inp.nextInt();
                    System.out.println(name +" "+age);
     
// Read all in one time

    while (inp.hasNextLine()) {
            String data = inp.nextLine();
            System.out.println(data);
        }
        
    System.out.println(fi.length()+" bytes");
                 
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
 //   Delete a File
 
    File myObj_file = new File("filename.txt"); 
    if (myObj_file.delete()) { 
        
    }
    
// Delete a Folder

 File myObj_folder = new File("C:\\Users\\MyName\\Test"); 
    if (myObj_folder.delete()) {
        
      System.out.println("Deleted the folder: " + myObj_folder.getName());
      
    } else {
        
      System.out.println("Failed to delete the folder.");
    }
 

 
    }
    
}
