class Over_Loadings
{
    public int add( int a , int b)
    {
       return a+b;
    }
}

class Second extends Over_Loadings
{
    public int add( int a , int b, int c)
    {
        return a+b+c;
    }
}

class Over_Loading
{
    public static void main(String[] args)
    {
        Second obj = new Second();
       
        System.out.println(obj.add(10,12));
        System.out.println(obj.add(10,12,20));
    }
}