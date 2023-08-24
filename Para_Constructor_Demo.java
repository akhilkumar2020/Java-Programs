/* Parameterized Constructor – A constructor which has a specific number of parameters is known as parameterized constructor. */

public class Para_Constructor_Demo 
{
  Para_Constructor_Demo(int a, int b)
  {
    System.out.println("The value of A is = " +a + " and the value of B is = " +b );
  }  

  public static void main(String[] args) 
  {
    Para_Constructor_Demo obj =  new Para_Constructor_Demo(10,23);
  }
}
