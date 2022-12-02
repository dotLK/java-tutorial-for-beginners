/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author IT13-091712
 */import java.util.*;
import java.io.*;
public class UserProfile {
    public static void main(String args[])
    {
        Scanner p = new Scanner(System.in);
        FileWriter fw = null;
        BufferedWriter bf = null;
        String c=null;
        try{
            
            do{
                fw = new FileWriter("D:\\Text.txt",true);
                bf = new BufferedWriter(fw);
                
                System.out.print("Name : ");
                String n = p.next();
                System.out.print("Age : ");
                int a = p.nextInt();
                System.out.print("Hobby : ");
                String h = p.next();
                
                bf.write("Name : " +n);
                bf.newLine();
                bf.write("Age : " +a);
                bf.newLine();
                bf.write("Hobby : " +h);
                
                System.out.print("Do you like to continue(Yes/No) : ");
                c = p.next();
                
            }while(c.equals("Yes"));
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
