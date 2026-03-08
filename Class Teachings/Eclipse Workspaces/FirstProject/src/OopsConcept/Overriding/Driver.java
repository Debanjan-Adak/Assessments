package OopsConcept.Overriding;

public class Driver {
	public static void main(String[] args) {
//		Parent p = new Parent();
//		Child c= new Child();
//		p.printStar();
//		c.printStar();
		It it = new It();
		Supporting supporting = new Supporting();
		Employee emp = new Employee();
		
		System.out.println("IT monthly sal : "+ it.SalCal(50000.00));
		System.out.println("Supporting monthly sal : "+ supporting.SalCal((byte)8));
		System.out.println("General Employee monthly sal : "+ emp.SalCal((byte)9));
		
		
	}
}
