package objectClass.equals;

public class Employee {
	String name;
	int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("Returning from 1st block because same object same address");
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			System.out.println(getClass());
			System.out.println(obj.getClass());
			System.out.println("Returning false from 2nd block as either obj is null or both \nref are of different type");
			return false;
		}
		Employee e = (Employee) obj;
		if(this.id == e.id) {
			System.out.println("Returning true because same number of doors");
			return true;
		}
		return false;
	}
}
