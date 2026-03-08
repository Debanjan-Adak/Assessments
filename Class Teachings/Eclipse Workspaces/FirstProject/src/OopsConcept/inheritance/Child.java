package OopsConcept.inheritance;

class A {

    static {
        i = 1;
        System.out.println("Hello");
    }
    
    static final int i;
    static final int j=getval();
    static int getval()
    {
    	System.out.println("getval");
    	return 9;
    	
    }
}
class Child{
	static  int b = 10;
	public static void main(String[] args) {
		A obj = new A();
		
	}
}