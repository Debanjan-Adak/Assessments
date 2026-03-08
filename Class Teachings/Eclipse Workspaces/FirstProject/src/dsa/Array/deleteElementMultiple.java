package dsa.Array;

public class deleteElementMultiple {
	public static void main(String[] args) {
		int count=0,element=3;
		int []arr= {1,2,3,3,4,4,3,4,5};
		
		for(int i=0,j=0;i<arr.length;i++)
		{
//			System.out.println(i+"  "+j+"  "+arr[i]+"  "+arr[j]);
			if(arr[i]==element)
			{
				count++;
			}
			else
			{
				arr[j]=arr[j+count];
				j++;
			}
			
			
			
		}
		for(int i=0;i<arr.length-count;i++)
			System.out.println(arr[i]);
	}
}
