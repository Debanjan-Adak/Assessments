public class CheckMatrixType {

    static void checkMatrix(int[][] arr, int rows, int cols) {

    	for(int i=0;i<rows-1;i++)
    	{
    		if(arr[i].length!=arr[i+1].length)
    		{System.out.println("Variable Matrix");
    			return;}
    	}
        if (rows == 1 && cols == 1) {
            System.out.println("Singleton Matrix");
            return;
        }
        if (rows == 1) {
            System.out.println("Row Matrix");
            return;
        }
        if (cols == 1) {
            System.out.println("Column Matrix");
            return;
        }
        if (rows != cols) {
            System.out.println("Rectangular Matrix");
            return;
        }
        boolean isDiagonal = true;
        boolean isIdentity = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	if (i != j && arr[i][j] != 0) {
                    isDiagonal = false;
                    isIdentity = false;
                }

                if (i == j && arr[i][j] != 1) 
                    isIdentity = false;
                
            }
            if(!isDiagonal && !isIdentity)
            	break;
        }

        if (isIdentity) {
            System.out.println("Identity Matrix");
        } else if (isDiagonal) {
            System.out.println("Diagonal Matrix");
        } else {
            System.out.println("Square Matrix");
        }
    }

    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};
        int rows=arr.length;
        int cols=arr[0].length;
        checkMatrix(arr, rows, cols);
    }
}
