Data abstraction is the process of hiding certain details and showing only essential information to the user (Abstraction is a process of hiding the implementation 
details and showing only functionality to the user). Abstraction can be achieved with either abstract classes (0-100%) or interfaces (100%). The abstract keyword 
is a non-access modifier, used for classes and methods:
	Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class). An abstract class can have 
 both abstract and regular methods.
	Abstract method: can only be used in an abstract class, and it does not have a method body. The body is provided by the subclass (inherited from).

SOME IMPORTANT POINTS SHOULD BE REMEMBERED ABOUT ABSTRACTION IN JAVA.
•	An abstract class must be declared with an abstract keyword.
•	It can have abstract and non-abstract methods.
•	It cannot be instantiated.
•	It can have constructors and static methods also.
•	It can have final methods that will force the subclass not to change the body of the method.
Note: The phrase "instantiating a class" means the same thing as "creating an object." When you create an object, you are creating an "instance" of a class, therefore "instantiating" a class.

Program- Abstraction
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
       Car obj = new BMW();  // Upcasting (If the reference variable of Parent class refers to the object of Child class, it is known as upcasting) 
       obj.run();  
    }  
}  
