
package oo;

public class ab {

   
    public static void main(String[] args) {
      
//The abstract keyword is a non-access modifier used for
//classes and methods:
    dog dg = new dog();
    dg.animalSound();
   dg.run();
   
   cat cc = new cat();
   cc.animalSound();
   cc.run();
   
        
    }
    
}


abstract class Animal {
    
  abstract  public void animalSound();
 
  
  public void run(){
  
  System.out.println("I am running...");
  }

}

class dog extends Animal {
    
    
    public void animalSound(){
        System.out.println("bowwww....");
    }


}
class cat extends Animal{
    
    public  void animalSound(){
        System.out.println("qwww....");
    } 
    

}

