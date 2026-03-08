
public class StringPoolChecker {
	
	public static void main(String[] args) throws InterruptedException {
		String s1="Dev";
		String s2="Abhijit";
		String s3=new String("Dev");
		System.out.println(System.identityHashCode(s1));
		s1=s1+"a";
		System.out.println(System.identityHashCode(s1));
		Thread.sleep(5000);
		s1="Dev";
		System.out.println(System.identityHashCode(s1));
		byte b=120;
		b=(byte) ((byte)b+30);
		System.out.println(b);
//		System.out.println(System.identityHashCode(s1)+" "+System.identityHashCode(s3)+" "+System.identityHashCode(s2));
//		s3="Dev";
//		System.out.println(System.identityHashCode(s1)+" "+System.identityHashCode(s3)+" "+System.identityHashCode(s2));
	}
}
