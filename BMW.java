abstract class Car
 {  
   abstract void run();  // No method body
 }
  
class BMW extends Car
 {  
     void run()   // abstract method body in child class
     {
       System.out.println("BMW Cars are too fast.");
     }  
    
    public static void main(String args[])
    {
       Car obj = new BMW();  // Upcasting (If the reference variable of Parent class refers to the object of Childclass, it is known as upcasting) 
       obj.run();  
    }  
}  
