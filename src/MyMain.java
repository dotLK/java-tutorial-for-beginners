
import Javalk.Presidents;
import Javalk.SriLanka;








public class MyMain {

   
    public static void main(String[] args) {
       
        
        System.out.println(SriLanka.Highest_waterfalls_height());
        System.out.println(Presidents.PresidentsNow());

// class name  name = new classname () ;
       
       boy b1 = new boy();
        b1.talk();
        
    }
    
}


class boy  {

/* accsess modifier (public = acc by All Class ,Private ,Protected = Only subclass) 
return type  method name  Talk 
(parameters type parameters name int i, String name /Argument )
{
  //method Body
System.out.println("i am talking");
}
*/

    
    public void talk() {
    
        System.out.println(" i am  talking");
    
    }
    public void eat() {
    
        System.out.println(" i am  eating");
    
    }
    

}