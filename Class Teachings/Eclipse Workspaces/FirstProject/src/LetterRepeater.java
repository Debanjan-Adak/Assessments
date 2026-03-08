
public class LetterRepeater {
	
	

	public static void main(String[] args) {
		
		int letterCount[]=new int[26];
		boolean visited[]=new boolean[26];
		for(int i=0;i<26;i++)
		{
			visited[i]=false;
		}
		StringBuilder s=new StringBuilder("basa");
		
		for(int i=0;i<s.length();i++)
		{
			letterCount[s.charAt(i)-'a']++;
		}
		for(int i=s.length()-1;i>=0;i--)
		{
		
			if(letterCount[s.charAt(i)-'a']>0 && visited[s.charAt(i)]==true)
			{
				for(int x=0;x<letterCount[s.charAt(i)-'a'];x++)
				{
					s.insert(i,s.charAt(i));
				}
				letterCount[s.charAt(i)-'a']--;
				if(letterCount[s.charAt(i)-'a']-1==1)
					flag=1;
			}
		}
		System.out.println(s);
	}

}
