public class Auto_Boxing
{
    public static void main(String[] args)
    {
        int num  = 10;
        Integer obj = Integer.valueOf(num);
        
        // Integer num = new Integer(10);
        //int num1 = num.intValue();
        
        System.out.println(num + " " + obj);
    }
}