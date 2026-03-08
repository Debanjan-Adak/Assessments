package dsa.Array;

public class StringPalin {

	static boolean stringPalin(String s) {
		int l = 0, r = s.length()-1;
		while (l <= r) {
			if (s.charAt(l++) != s.charAt(r--))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "abcddcba";
		String s1 = "abcdjsidg";
		System.out.println(stringPalin(s1));
	}
}
