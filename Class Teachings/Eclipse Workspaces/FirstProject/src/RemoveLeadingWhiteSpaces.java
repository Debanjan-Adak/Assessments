
public class RemoveLeadingWhiteSpaces {
	
	private static void removeWhite(StringBuilder s1)
	{
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ') {
				System.out.println(s1.substring(i));
				return;}
		}
	}
	public static void main(String[] args) {
		StringBuilder s1= new StringBuilder("    hello hello");
		removeWhite(s1);
		
	}

}
