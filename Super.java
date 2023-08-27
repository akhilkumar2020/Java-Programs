 class Super_Class 
{
 String color = "Brown";   
}

class Junior extends Super_Class
{
    String color = "Green";
    
    void display()
    {
        System.out.println("the color of junior class is:" +color);
        System.out.println("the color of parent class is:" +super.color);
    }
}

class Super
{
      public static void main(String[] args) 
    {
        Junior obj = new Junior();
        obj.display();
    }
}
