
public class FlowControl {

    public static void main(String[] args) {
        
      int a = 25 ;
      int b = 25 ;
      
      // <, <=, >, >= ,== , !=

      
      if(a != b ){ 
        //true
        
        System.out.println("yes");  
          
      }else{
          //false
         System.out.println("No");  
      
      }
       
     //!, ^, &, |
 
     boolean z = false  ; //0
     boolean x = false ; //0 
          if( z | x ){
     
         System.out.println("Ok");
     }else{
         
         System.out.println("No");
     }
     
   // &&, || 
    String un = "name" ;
    int pw =  123 ;   
    
        if ( un=="nameio" || pw== 11223 ) {
            
            System.out.println("login..!");
            
        } else {
            
            System.out.println("login fail..!");
            
        }
  
        
        //Conditional Operator: ?
        
        boolean b1 = false;
        
        String  bb = b1 ? "Yes" : "No" ;
        
        System.out.println(bb);
        
        
        
        
    }
    
}
