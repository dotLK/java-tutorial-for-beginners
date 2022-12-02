
public class MyStr {

    
    public static void main(String[] args) {
      
     
     String x1 = "Hello" ;
     String x2 = "Java" ;
     String x ;
     
     //x= x1 + x2; // concatenation
     x= x1.concat(x2);
             
      /*
     
     System.out.println(x.trim());
     
     System.out.println(x.length());
     
     System.out.println(x.charAt(4));
     
     System.out.println(x.substring(1,2));
     
     System.out.println(x.indexOf("a"));
     */
      String a = "hi";
      String b = "Hi";
      
             
        if (a.equalsIgnoreCase(b)) { // a==b
            
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
     


// negative if a < b, positive if a > b, and zero if a is equal b
       
       int z= a.compareToIgnoreCase(b);
        System.out.println(z);
        
        String zz = "cat";
        
        System.out.println(zz.replace("ca", "An"));
        
        double total = 100.01125 ;
        
        String tot = Double.toString(total);
        
        System.out.println(tot);
         
        String all = "5500";
        
        int xx =  Integer.parseInt(all);
        
        int xxx= Integer.valueOf(all);
        
        System.out.println(xx );
        System.out.println(xxx);
       
        
    }
    
}
