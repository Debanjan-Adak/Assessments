package objectClass.toString;

public class Employee {

	String name;
	int id;
	
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Employee ID is "+this.id+" and name is "+this.name;
	}
}
