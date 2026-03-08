import java.util.Stack;

public class StackProblem {
	
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

	private static int thirdLargest(int[] arr) {
		int largest = arr[0], secondLargest = arr[0], thirdLargest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			} else if (arr[i] > thirdLargest && arr[i] != secondLargest) {
				thirdLargest = arr[i];
			}
		}
		return thirdLargest;
	}

	private static boolean checkPattern(String s, String pattern) {
		int l = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == pattern.charAt(l)) {
				l++;
				
			} else {
				i=i-l;;
				l = 0 ;
				
			}
			
			if (l == pattern.length() )
				return true;
		}
		return false;
	}
	
	private static int sum2D(int[][] arr) {
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr[i].length; j++) {
	            sum += arr[i][j];
	        }
	    }
	    return sum;
	}

	public static void main(String[] args) {
//		
//		int arr[]= {1,3,2,5,4,7,7,7,6,6,6,6,9,9,9,8,8,8,8};
//		System.out.println(thirdLargest(arr));
		String s = "aaabbc";
		String p = "aab";
		System.out.println(checkPattern(s, p));

	}

}
