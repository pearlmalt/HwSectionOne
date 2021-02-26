package ep;


public class Constructors2_5 {
    int num; 
    String name; 

    void Java() 
    { 
        System.out.println("Constructor called"); 
    } 
} 
  
class GFG 
{ 
    public static void main (String[] args) 
    { 
 
        Java java1 = new java(); 
  

        System.out.println(java1.name); 
        System.out.println(java1.num); 
    } 
} 
