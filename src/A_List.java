
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class A_List {

   
    public static void main(String[] args) {
       
  /* 
  //cat , Dog ,Rat , Bird ,lion 
        ArrayList<String> list = new  ArrayList<>();
        
        list.add("cat");
        list.add("Dog");
        list.add("Rat");
        list.add(1, "Lion");
        
        System.out.println(list);
        
        System.out.println(list.get(3));
        
        System.out.println(list.indexOf("Dog"));
        
        list.remove(1);
        System.out.println(list.size());
        
      */  
        
  ArrayList<String> let = new  ArrayList<>();
  ArrayList leta = new  ArrayList<>();
        
        let.add("Z");
        let.add("F");
        let.add("A");
        let.add("E");
        
   System.out.println(let.get(3));
   
        Collections.sort(let);
       System.out.println(let); 
       
  ArrayList<Integer> num = new  ArrayList<>();
        
        num.add(20);
        num.add(30);
        num.add(80);
        num.add(10);
        Collections.sort(num);
       System.out.println(num); 
       
       
       HashMap mp = new HashMap();
         
       mp.put("Uva", "Badulla");
       mp.put("West", "Colombo");
       mp.put("South", "Galle");
       mp.put("North", "Jafna");
       
        System.out.println( mp.get("Uva")  );
        
              
    }
    
}
