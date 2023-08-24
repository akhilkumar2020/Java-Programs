/*CONSTRUCTOR – 

	1. A constructor is also a block of statements and instructions.
	2. Constructor name is same as the class name.
	3. Constructor has no RETURN TYPE.
    4. Constructor cannot ABSTRACT, STATIC, FINAL, and SYNCHRONIZED.

    Types of Constructor – 
                    1.	Default constructor
                    2.	Parameterized constructor

                    1.	Default Constructor -  It does not have any parameter. In java if  class have  no constructor then complier 
                                                automatically create default constructor. The main purpose of default constructor is 
                                                to INTIALIZE the instance variable of a class. */

class Constructor_Demo
{
    Constructor_Demo()
    {
        System.out.println("Hello Constructor");
    }

    public static void main(String[] args) 
    {
      Constructor_Demo obj = new Constructor_Demo(); 
    }
}