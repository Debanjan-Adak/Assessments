
public class LowToUpandVIce {

	public static void main(String[] args) {
		String test="B@s1a";
		StringBuilder result = new StringBuilder("");
		for(int i=0;i<test.length();i++) {
			if(test.charAt(i)>='a'&&test.charAt(i)<='z')
				result.append((char)(test.charAt(i)-32));
			else if(test.charAt(i)>='A'&&test.charAt(i)<='Z')
				result.append((char)(test.charAt(i)+32));
			else
				result.append(test.charAt(i));
			
		}
		System.out.println(result);
	}

}
