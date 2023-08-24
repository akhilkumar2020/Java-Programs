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
