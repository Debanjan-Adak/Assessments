import java.util.Stack;

public class CheckParenthesis {

	private static boolean checkParenthesis(String s)
	{
		Stack<Character> p=new Stack<>();
		for(char c:s.toCharArray())
		{
			if(c=='('||c=='['||c=='{')
				p.push(c);
			
			if(c==')' && p.pop()!='(') return false;
			if(c=='}' && p.pop()!='{') return false;
			if(c==']' && p.pop()!='[') return false;
			
		}
		if(!p.isEmpty()) return false;
		return true;
	}
	public static void main(String[] args) {
		String s1="hello{[[(}dsfg]rg]}";
		System.out.println(checkParenthesis(s1)); 
	}

}
