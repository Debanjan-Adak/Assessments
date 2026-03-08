package non_primitive_typecasting;

public class Downcasting {
	public static void main(String[] args) {
//		Parent p = new Parent();
//		System.out.println(p.p);
//		p.pm();
//		Child c = new Child();
//		System.out.println(c.c);
//		c.cm();
//		System.out.println(c.p);
//		c.pm();
//		
//		//upcasting
//		Child c1=new Child();
//		Parent p1=c1;
//		System.out.println(c1.c);
//		c1.cm();
//		c1.pm();
//		System.out.println(c1.p);
////		System.out.println(p1.c);// thus not allowed
////		p1.cm(); // with the help of upcasting we can only access parent class methods and variables.
//		System.out.println(p1.p);
		Child c = new Child();
		System.out.println(c);
		Parent p=c;
		System.out.println(p);
		Child c1 = (Child)p;
		System.out.println(c1);
		// all address of these containers
		System.out.println(c1.p);
		System.out.println(c1.c);
		c1.pm();
		c1.cm();
		

	}

}
