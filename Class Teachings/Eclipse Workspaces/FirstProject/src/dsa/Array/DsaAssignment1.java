package dsa.Array;

public class DsaAssignment1 {

	static int indexSum(String s, int sum) {
		int index = -1;
		int l=0,r,temp=0;
		for(r=0;r<s.length();r++)
		{
			temp+= s.charAt(r);
			while(l<r && temp>sum )
			{
				temp-=s.charAt(l++);
			}
			if(temp==sum)
				return l;
				
		}
		return index;
	}
	static int indexSumDig(String s, int sum) {
		int index = -1;
		int l=0,r,temp=0;
		for(r=0;r<s.length();r++)
		{
			temp+= s.charAt(r)-'a'+1;
			while(l<r && temp>sum )
			{
				temp-=s.charAt(l++);
			}
			if(temp==sum)
				return l;
				
		}
		return index;
	}
	static int StringLength(String s)
	{
		int c=0;
		for(char i:s.toCharArray())
		{
			c++;
		}
		return c;
	}
	public static void main(String[] args) {

		
		System.out.println(indexSum("Hello", 108));
		System.out.println(indexSumDig("hello",13));
		System.out.println(StringLength("hakuna"));
	}
	public static void main(String[] args,int a)
	{
		
	}

}
