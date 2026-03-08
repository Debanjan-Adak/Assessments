package OopsConcept.inheritance;

public class Driver {
	public static void main(String[] args) {
		Parent p=new Parent();
		Child c=new Child();
		System.out.println(p.a);
		//System.out.println(p.b);
		System.out.println(c.a);
		System.out.println(c.b);
		Parent p1 = new Child();
		//Child c1= new Parent();
	}
}
