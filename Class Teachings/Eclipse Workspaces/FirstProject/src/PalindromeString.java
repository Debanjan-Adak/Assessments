
public class PalindromeString {

	private static boolean isPalindrome(StringBuilder str)
	{
		int p1=0;
		int p2=str.length()-1;
		while(p1<p2)
		{
			if(str.charAt(p1++)!=str.charAt(p2--))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("   naman  	");
		System.out.println(isPalindrome(str));
	}

}
