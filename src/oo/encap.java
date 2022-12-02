
package oo;

public class encap {

    
    public static void main(String[] args) {
       
       Person ma = new Person();
       ma.setName("saman");
       
      
        System.out.println( ma.getName());
        
    }
    
}

class Person {

    private String Name ;
    
    
    public void setName(String newName){
    
        this.Name = newName;
              
    }
    
    public String getName(){
    
    return Name;
    }
    

}
