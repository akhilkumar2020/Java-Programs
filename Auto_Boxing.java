public class Auto_Boxing
{
    public static void main(String[] args)
    {
        int num  = 10;
        Integer obj = Integer.valueOf(num);  // Autoboxing
        
        // Integer num = new Integer(10);
        //int num1 = num.intValue();    // Unboxing 
        
        System.out.println(num + " " + obj);
    }
}
