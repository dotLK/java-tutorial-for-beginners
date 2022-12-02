



public class Arrays {

    
    public static void main(String[] args) {
      
        
     //animal = cat , Dog ,Rat , Bird ,lion 
      
  /*  int [] abc = new int[3];
  
    abc[0] = 10;
    abc[1] = 20;
    abc[2] = 30;
   
   
               // 0  1  2  3  4
  int [] abc  = {10,20,30,40,50};
  
  
     System.out.println(abc[4]);
    */  
     
 // animal = cat , Dog ,Rat , Bird ,lion    

/* 
                    // 0      1       2       3        4
 String [] animal = {"cat" , "Dog" ,"Rat" , "Bird" ,"lion"}; 
 
for(int i = 0; i < animal.length ; i++ ){
 
     System.out.print(animal[i] + " ");
}

        System.out.println("");
 animal[0] = "mouse";
 
 
 for(int i = 0; i < animal.length ; i++ ){
 
     System.out.print(animal[i]+ " ");
}
 
 */
 
 

int [][] num = new int [2] [3] ;
 
 /*     10 20
 1[0] =[0][1]
 2[1]= [0][1][2]
 

*/ 
/*  
 num [0][0] = 10;
 num [0][1] = 20;
 
 num [1][0] = 25;
 num [1][1] = 35;
 num [1][2] = 45;
 
        System.out.println("This ois Java f");
  
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 3; j++) {
             
             System.out.println(num[i][j]  );   
                
                
            }
        }
  */
        
 

//  int [] abc = new int[3];

  Stu [] s = new Stu[3];
    
    s[0] = new Stu("amal", 25);
    s[1] = new Stu("kamal", 20);
    s[2] = new Stu("Nimal", 25);
   
    
        for (int i = 0; i < s.length; i++) {            
              
           System.out.println(s[i].Name() +" "+ s[i].Age()); 
            
            
        }
   
        
      
        
        
        
        
        
        
      
       
/*    

  Stu [] s =new Stu[]{
  
   new Stu("kaml", 20),
   new Stu("Amal", 22),
   new Stu("Amara", 33),
   new Stu("nimal", 20),
   new Stu("sunil", 22),
   new Stu("Ramant", 33)
   
  
  };
  
        
        for (int i = 0; i < s.length; i++) {
            System.out.println( s[i].Name() + " " + s[i].Age()    );
            
        }
  
  
  */
  
 
    }
    
}
