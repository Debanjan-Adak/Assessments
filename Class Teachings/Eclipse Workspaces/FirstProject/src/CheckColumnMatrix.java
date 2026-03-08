
public class CheckColumnMatrix {
	
	
	private static boolean checkColumnMat(int arr[][])
	{
		if(arr.length == 0)
			return false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length !=1)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		int [][] arr= null;
		try{
			if(checkColumnMat(arr))
			System.out.println("This is a column matrix");
			else
			System.out.println("Not a column matrix");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
