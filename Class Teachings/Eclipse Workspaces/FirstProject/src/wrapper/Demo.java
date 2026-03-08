package wrapper;

public class Demo {
	public static void main(String[] args) {
//		byte b = 7;
//		Byte b1 = b;
//		System.out.println("b1 : " + b1);
//		byte b2 = b1;
//		System.out.println("b1 : " + b2);
//		System.out.println(Byte.MIN_VALUE);
//		// Parsing
		String bStr[] = { "abcd-+12e98fgh", "-1", "+1", "1", "-0", "+0", "0", "1+", "1-", "++", "--", "a", "a0", "a9",
				"!", "", " " };
//		System.out.println("type of bStr " + bStr.getClass());
		// Parsing using constructor
//		Byte b3 = new Byte(bStr[i]);
//		System.out.println("type of b3 " + b3.getClass());
//		System.out.println("b3 : " + b3);
		// Parsing using parse

		for (int i = 0; i < bStr.length; i++) {
			try {
				byte b4 = Byte.parseByte(bStr[i]);
				System.out.println(bStr[i] + " : " + b4);
			}

			catch (Exception e) {
//				System.out.println("In catch" + bStr[i]);
				StringBuilder sB = new StringBuilder("");
				String s = bStr[i];
				boolean dig = false;
				for (int j = 0; j < s.length(); j++) {
					if (dig == true && !Character.isDigit(s.charAt(j)))
						break;
					if ((j + 1 < s.length()) && (s.charAt(j) == '+' || s.charAt(j) == '-')
							&& (s.charAt(j + 1) >= '0' && s.charAt(j + 1) <= '9')) {
						sB.append(s.charAt(j));
						continue;
					} else if (s.charAt(j) >= '0' && s.charAt(j) <= '9') {
						dig = true;
						sB.append(s.charAt(j));
					}

				}
//				System.out.println(sB);
				if (sB.toString().equals("") || sB.toString().equals("+") || sB.toString().equals("-"))
					System.err.println(bStr[i] + " : Null Value");
				else {
//					System.out.println("In else");
					byte b4 = Byte.parseByte(sB.toString());
					System.out.println(bStr[i] + " : " + b4);
				}

			}
		}

	}
}
