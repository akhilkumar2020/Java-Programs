In Java, the final keyword is used to denote constants. It can be used with variables, methods, and classes.
Once any entity (variable, method, or class) is declared final, it can be assigned only once. That is,
	The final variable cannot be reinitialized with another value
	The final method cannot be overridden
	The final class cannot be extended

PROGRAM - FINAL KEYWORD
public class Final_Demo 
{
    final int num = 10;  
    
   
   public static void main(String[] args) 
   {
    Final_Demo obj =  new Final_Demo();
    obj.num = 20;
    System.out.println(obj.num);
   }
}
