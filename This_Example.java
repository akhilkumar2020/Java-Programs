The "this" keyword refers to the current object in a method or constructor.
The most common use of the "this" keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is 
shadowed by a method or constructor parameter).

this can also be used to:
1. Invoke the current class constructor
2. Invoke the current class method
3. Return the current class object
4. Pass an argument in the method call
5. Pass an argument in the constructor call

PROGRAM - "this" keyword
    
class This_Example
{
    int age;
    String name;

      This_Example(int age, String name)
    {
        this.age = age;
        this.name = name;
         System.out.println(age + " " + name);
    }

    public static void main(String[] args)
    {
        This_Example obj = new This_Example(28, "Akhil");
    }
}

