
public class StaticNonStatic {

	static int a=5;
	static
	{
		System.out.println("Static Block1");
	}
	{
		System.out.println("Non Static Block1");
	}
	public StaticNonStatic() {
		System.out.println("Inside Constructor");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside Main");
		StaticNonStatic s1= new StaticNonStatic();
		StaticNonStatic s2= new StaticNonStatic();
		System.out.println("Exiting main");

	}
	{
		System.out.println("Non Static Block2");
	}
	static
	{
		System.out.println("Static Block2");
	}
}
