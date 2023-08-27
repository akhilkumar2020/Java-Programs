class Method_Chaining
{    	
    public Test method1(){
	System.out.println("m1 is invoked");
	return this;
    }
	
    public Test method2(){
	System.out.println("m2 is invoked");
	return this;
    }
    
    public Test method3(){
	System.out.println("m3 is invoked");
	return this;
    }
    
    public static void main(String args[]) {
	new Method_Chaining().method1().method2().method3();
    }
}
