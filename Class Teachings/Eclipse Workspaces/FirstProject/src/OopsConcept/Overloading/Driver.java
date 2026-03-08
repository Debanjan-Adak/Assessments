package OopsConcept.Overloading;

public class Driver {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		p.printNum(8);
		c.printNum(5.5);
		c.printNum(3.4, 2.4);
	}
}
