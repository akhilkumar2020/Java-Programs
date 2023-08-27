class Test{
    
	
    public Test m1(){
	System.out.println("m1 is invoked");
	// do something
	return this;
    }
	
    public Test m2(){
	System.out.println("m2 is invoked");
	// do something
	return this;
    }
    
    public Test m3(){
	System.out.println("m3 is invoked");
	// do something
	return this;
    }
    
    public static void main(String args[]) {
	new Test().m1().m2().m3();
    }
}