
package oo;

public class inhe {

    
    public static void main(String[] args) {
        
        child  kamal = new child();
        kamal.home();
        kamal.car();
        kamal.wallet();
        
      
    }
    
}


class parent {  // final class parent ;

    public void car(){
        System.out.println("Toyota");

    }
    
    public void wallet(){
        System.out.println("$$$$");

    }
    
    public void home(){
        System.out.println("my home");

    }

}

class child extends parent {

    public void bike(){
        System.out.println("bike..");

    }
}
