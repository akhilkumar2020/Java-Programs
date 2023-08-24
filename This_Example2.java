class This_Example2
{
    void akhil()
    {
        System.out.println("Hello Akhil Kumar");
    }

    void aman()
    {
        System.out.println("Hello Aman Kumar");
        this.akhil();
    }

    public static void main(String[] args) 
    {
        This_Example2 obj = new This_Example2();
        obj.aman();
    }
}

