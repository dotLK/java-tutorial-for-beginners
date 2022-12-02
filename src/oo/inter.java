
package oo;

public class inter {

    public static void main(String[] args) {
       
       Rat r1 = new Rat();
       r1.animalSound();
       r1.sleep();
        
    }
    
}

interface  Animals{
//An interface is a completely "abstract class" that is used to 
    //group related methods
public void animalSound();

public void sleep();

}

class Rat implements Animals {

    @Override
    public void animalSound(){
      System.out.println("seeee...");
    }
    
    @Override
    public void sleep(){
      System.out.println("rat sleeep...");
    }

}