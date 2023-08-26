Method Overloading (Compile time Polymorphism) –  If a class has multiple methods having the same name but different in parameter, is known as method overloading.
A class having two or more methods with the same name but with different arguments then we say that those methods are overloaded. 
Static polymorphism is achieved in Java using method overloading. Method overloading is used when we want the methods to perform similar tasks but with different 
inputs or values. When an overloaded method is invoked, Java first checks the method name, the number of arguments, type of arguments; based on this compiler
executes this method.
The compiler decides which method to call at compile time. By using overloading static polymorphism or static binding can be achieved in Java. 
Note: The return type is not part of the method signature. we may have methods with different return types but return type alone is not sufficient to call a 
method in Java.

Ways to overload the method – 
                            1.	By changing the number of arguments.
                            2.	By changing the data types.

PROGRAM - Method Overloading - By changing the number of Arguments
  
class OverLoding_Demo
{
    public int add( int a , int b)
    {
       return a+b;
    }
}

class Secondary extends OverLoding_Demo
{
    public int add( int a , int b, int c)
    {
        return a+b+c;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Secondary obj = new Secondary();
       
        System.out.println(obj.add(10,12));
        System.out.println(obj.add(10,12,20));
    }
}
