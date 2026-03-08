package exception.c_e;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}

}

class InvalidAgException extends Exception {
	public InvalidAgException(String message) {
		super(message);
	}

}

public class CustomCheckedExceptionDemo {
	public static void validateAge(int age) throws InvalidAgeException, InvalidAgException {
//		Permit permit;
		if (age > 21) {
			System.out.println("Age is valid proceed to registration");
//			return Permit.YES;
		} else if (age >= 18) {
			System.out.println("You can drink beer and wine, no whiskey, rum, vodka for you");
//		return Permit.MAYBE;
		} else if (age >= 16) {
			throw new InvalidAgException("You can drink only Beer, no hard Liquor for you.");
		} else
			throw new InvalidAgeException("No Alcohol");

	}

	public static void main(String[] args) {
		try {
			validateAge(14);
		} catch (InvalidAgeException | InvalidAgException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}