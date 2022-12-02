
import java.util.Random;
import java.util.Scanner;


public class Scan {

   
    public static void main(String[] args) {
    
      
        
      
       
      try{
        
        // name  "Hi "  = Hi name ;
        
        Scanner name = new Scanner(System.in);        
        
        System.out.print("Enter Your Name :");
        
       System.out.println( "Hi "  +  name.nextLine()  );  
        
     double fn ,sn ,ans ;
        
        System.out.println("Enter 1st num = ");
        fn = name.nextDouble();
        
        System.out.println("Enter 2nd Num = ");
        sn = name.nextDouble();
        
        ans = fn +sn ;
        
        System.out.println("Answer = " + ans);
        
        }catch(Exception e){
            System.out.println(e);
        
        } 
     
   
     
        try {
            
             
       Scanner inp = new Scanner(System.in);
   
   System.out.println("1. Sinhala\n2. Tamil\n3. English");   
    System.out.print("Select Your language : "); 
  
  String lng = null ;
  
  switch(inp.nextInt()){
      
      case 1 : lng = "sinhala" ; break;
      
      case 2 : lng = "tamil" ; break;
      
      case 3 : lng = " english" ; break;
      
      default : lng = "Not valid" ;
        
  }

  System.out.println("Your language is : " +lng);
        
            
            
        } catch (Exception e) {
            
            System.out.println("Pls Enter Number 1.2.3");
        }
   
  
 
   
   
        Random ran = new Random();
        int i = ran.nextInt(1000);//
        System.out.println(i);
        
      
        
    }
    
}
