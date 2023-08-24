STATIC METHOD – Static method means class method, so we don't need to create an object of the class, we can call the method directly.

PROGRAM - Static method
public class Static_Method
{
    public static void show()
    {
        System.out.println("Hello Static Method");
    }

    public static void main(String[] abc)
    {
        show();
    }
}

NORMAL METHOD – In the normal method, we need to create an object of the class in order to call the method.

PROGRAM - Non-Static/Normal Method

public class Non_Static_Method
{
    public void show()
    {
        System.out.println("Hello Static Method");
    }

    public static void main(String[] abc)
    {
        Non_Static_Method obj = new Non_Static_Method();
        obj.show();
    }
}
