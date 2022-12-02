
public class HelloJava {
 
    public static void main(String[] args) {
   
      /*
       Escape Characters
        
       \b = big
       \f = farm
       \n = need
       \r = red
       \t = tractor
        
        \"
        \'
        \\
        
       j = java 8
       
        - 128 0 1   127   27 
        
      */
      
     byte b = 127 ; 
     short v = 32767;
     int bb = 2147483645 ; 
     long  vv = 9223372036854775807L;
     
     char l = 'D';
     String o = "ajalks sdjksdskldd skdsk897878d 8789ds" ;
     
    
     float fv  = 12.12f ;
     double df = 3232.323232 ;
     
     boolean nm = true;
     boolean nv = false;
     
    
     
     String j = "java 99"; //  Declaring and Initializing Variables     
     
     
     System.out.println(j+ " is \binvented by  James Gosling\f and others in 1994.");
     System.out.println("Gosling was writing\n a new language, which\\ he named “Oak”.");
     System.out.println(j + " was originally named Oak.");
     System.out.println("Oak\tbecame\" “" + j + "”. ");   
     
     
     
    }
    
}
