package objectClass.clone;


class Employee implements Cloneable{
	int id;
	Employee(int id)
	{
		this.id = id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class Test {

	public static void main(String[] args) throws Exception {
		Employee e1=new Employee(101);
		Employee e2 = (Employee)e1.clone();
		e2.id=5;
		System.out.println(e1.id+" "+e2.id);
		System.out.println(e1+" "+e2);
	}

}
