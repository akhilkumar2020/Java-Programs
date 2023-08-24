Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. 
The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
There are two types of polymorphism in Java:- 
                                            Compile-time polymorphism (method overloading) and 
                                            Runtime polymorphism (method overriding). 

Why And When To Use "Inheritance" and "Polymorphism"? - 
                                                    It is useful for code reusability: reuse attributes and methods of an existing class when you create a 
                                                    new class.

PROGRAM
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
