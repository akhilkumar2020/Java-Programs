class This_Example
{
    int age;
    String name;

      This_Example(int age, String name)
    {
        this.age = age;
        this.name = name;
         System.out.println(age + " " + name);
    }

    public static void main(String[] args)
    {
        This_Example obj = new This_Example(28, "Akhil");
    }
}

