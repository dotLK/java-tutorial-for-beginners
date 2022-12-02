
public class Str {

    
    public static void main(String[] args) {
       
        String x = "text" ;
        String x1 = "me" ;
        String x2  ;
        
       x2 = x.concat(x1) ; // concatenation
       x2 = x +  x1  ; // concatenation
       System.out.println(x2);
       
       System.out.println(x2.length()); 
       
       System.out.println(x2.charAt(0)); 
       
        System.out.println(x2.substring(1));
        
        
    }
    
}
