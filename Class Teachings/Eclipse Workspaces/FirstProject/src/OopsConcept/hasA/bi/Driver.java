package OopsConcept.hasA.bi;

public class Driver {
	public static void main(String[] args) {
		Engine engine = new Engine();
		car car= new car();
		car.engine=engine;
		System.out.println(car.engine.noOfCyl);
	}
}
