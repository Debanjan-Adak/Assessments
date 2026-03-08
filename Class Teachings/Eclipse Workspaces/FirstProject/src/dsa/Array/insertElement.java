package dsa.Array;

public class insertElement {
	public static void main(String[] args) {
		
		int element=30,pos=2;
		int arr[]= {1,2,3,4,5};
		
		int arrRes[]=new int[arr.length + 1];
		
		for(int i=0,j=0;i<arr.length;j++)
		{
			if(j==pos)
				{arrRes[j]=element;continue;}
			arrRes[j]=arr[i++];
			
		}
		for(int i=0;i<arrRes.length;i++)
			System.out.println(arrRes[i]);
	}
}
