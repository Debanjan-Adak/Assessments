package enums;

public class Driver {

	public static void main(String[] args) {
		Day day = Day.MONDAY;
		System.out.println(day.getCode());
		switch(day.getCode()) {
		case 1:
			System.out.println("do 5 dsa problems");
			break;
		}
	}

}
