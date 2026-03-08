class Coordinate
{
	int row,column;
	Coordinate(int row,int column)
	{
		this.row=row;
		this.column=column;
	}
}
public class setMatrixZero {

	private static int countElements(int arr[][])
	{
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				count++;
			}
		return count;
	}
	public static void main(String[] args) {
		
		int arr[][]= {{1,4,7},{0,0,8},{3,6,9}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
			}
		System.out.println();
		int count =  countElements(arr);
		int k=0;
		Coordinate c1[] = new Coordinate[count]; 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==0)
				{
					c1[k++]=new Coordinate(i,j);
				}
			}
			}
		for(int x=0;x<k;x++)
		{
			int row=c1[x].row;
			for(int j=0;j<arr[row].length;j++) {
				arr[row][j]=0;
				
			}
			int col=c1[x].column;
			for(int i=0;i<arr.length;i++) {
				arr[i][col]=0;
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
			}
		

	}

}
