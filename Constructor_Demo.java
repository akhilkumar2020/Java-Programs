CONSTRUCTOR – 

	1. A constructor is also a block of statements and instructions.
	2. The constructor name is same as the class name.
	3. The constructor has no RETURN TYPE.
        4. Constructor cannot ABSTRACT, STATIC, FINAL, and SYNCHRONIZED.

    Types of Constructors – 
                    1.	Default constructor
                    2.	Parameterized constructor

                    1.	Default Constructor -  It does not have any parameters. In Java, if  the class has  no constructor then compiler 
                                                automatically creates a default constructor. The main purpose of a default constructor is 
                                                to INITIALIZE the instance variable of a class. 

PROGRAM - Default Constructor
		
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
