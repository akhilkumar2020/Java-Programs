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