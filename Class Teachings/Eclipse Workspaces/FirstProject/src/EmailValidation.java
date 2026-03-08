
public class EmailValidation {
	static String email="titan.jr.200310@gmail.com";
	public static void main(String[] args) {
		if(isValidEmail(email))
			System.out.println("Valid Email");
		else
			System.out.println("Not Valid Email");
	}
	private static boolean isValidEmail(String email)
	{
		if(!email.contains("@"))
			return false;
		if(!(email.indexOf('@') == email.lastIndexOf('@')))
			return false;
			
		
		return true;
	}

}
