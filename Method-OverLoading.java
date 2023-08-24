Method Overloading (Compile time Polymorphism) –  If a class has multiple methods having the same name but different in parameter, is known as method overloading.

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
