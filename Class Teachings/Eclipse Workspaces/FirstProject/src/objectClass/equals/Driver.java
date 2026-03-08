package objectClass.equals;

public class Driver {

	public static void main(String[] args) {
		Employee e1 = new Employee("Debanjan",28);
		Employee e2 = new Employee("Debanjan",28);
		Employee e3 = e1;
		System.out.println(e1.equals(e2));
		String s1="hello";
		String s2= new String("hello");
		System.out.println(e1.equals(s1));
		System.out.println(e1.equals(e3));
		
		
	}

}
