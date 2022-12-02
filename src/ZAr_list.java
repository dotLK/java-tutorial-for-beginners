
import java.util.ArrayList;
import java.util.Collections;


public class ZAr_list {

    
    public static void main(String[] args) {
        
   
  int [] abc = new int[3];
  
    abc[0] = 10;
    abc[1] = 20;
    abc[2] = 30;
   
             // 0  1  2  3  4
  int [] aa  = {10,20,30,40,50}; 
  
/*    ArrayList<Integer>  num =  new ArrayList<>();
    
    num.add(10);
    num.add(20);
    num.add(30);
    num.add(40);
    
   System.out.println(num);
   
   System.out.println(num.get(2));
  
  num.set(2, 35);
  
  System.out.println(num.get(2));
  
  System.out.println(num);
  
  
        for (int i = 0; i < num.size(); i++) {
            
            System.out.println(num.get(i));
            
        }
  
        for (Integer i : num) {
            System.out.println(i);
        }
*/


  
  ArrayList<Integer>  num1 =  new ArrayList<>();
  
    num1.add(10);
    num1.add(60);
    num1.add(20);
    num1.add(50);
    num1.add(70);
  
    System.out.println(num1);
   
  Collections.sort(num1);
        System.out.println(num1);     
  
        
   ArrayList<String> cars = new ArrayList<>();
    cars.add("Z");
    cars.add("A");
    cars.add("F");
    cars.add("C");
   Collections.sort(cars);  // Sort cars
    for (String i : cars) {
      System.out.println(i);
    }     
    



    
        
    }
    
}
