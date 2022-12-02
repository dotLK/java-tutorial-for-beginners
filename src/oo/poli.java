
package oo;

public class poli {

    
    public static void main(String[] args) {
       
        Allanimal ani = new Allanimal();
        ani.animalSound();
        
        
        Allanimal mylion  = new lion();
        mylion.animalSound();
        
        Allanimal mybee =new bee();
        mybee.animalSound();
        
        
    }
    
}

class Allanimal{

        public void animalSound(){
            System.out.println("The animal makes a sound");
              
        }
}

class lion extends Allanimal{
    @Override
    public void animalSound(){
            System.out.println("gruuuz.....");
              
        }

}
class bee extends Allanimal{
    @Override
    public void animalSound(){
            System.out.println("beezz.....");
              
        }

}