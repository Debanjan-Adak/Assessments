package OopsConcept.hasA.uni;

public class Driver {
	public static void main(String[] args) {
		Engine engine = new Engine();
		
		Car car= new Car();
		car.engine=engine;
		engine.car=car;
		System.out.println(car.engine.noOfCyl);
		System.out.println(engine.car.colour);
	}
}
