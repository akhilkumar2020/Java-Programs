Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. 
The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
There are two types of polymorphism in Java:- 
                                            Compile-time polymorphism (method overloading) and 
                                            Runtime polymorphism (method overriding). 

Why And When To Use "Inheritance" and "Polymorphism"? - 
                                                    It is useful for code reusability: reuse attributes and methods of an existing class when you create a 
                                                    new class.

PROGRAM - Method Overriding

class Polym_Demo
{
    double interest()
    {
        return 0.0;
    }
}

class BOI extends Polym_Demo
{
    double interest()
    {
        return 7.5;
    }
}

class SBI extends Polym_Demo
{
    double interest()
    {
        return 6.9;
    }
}

class HDFC extends Polym_Demo
{
    double interest()
    {
        return 12;
    }
}

class Poly_Demo
{
    public static void main(String[] args)
    {
        Polym_Demo obj = new BOI();
        System.out.println("The Interst rate of Bank of Baroda  is = " + obj.interest());

        obj = new SBI();
        System.out.println("The Interst rate of State Bank of India  is = " + obj.interest());
    }
}
