public class NumberOfIslands {
	
	public static int func(char[][] grid,boolean[][] vis,int i,int j){
        if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j]=='0'|| vis[i][j])
            return 0;
        else{
            vis[i][j]=true;
            func(grid,vis,i+1,j);
            func(grid,vis,i,j+1);
            func(grid,vis,i-1,j);
            func(grid,vis,i,j-1);
            return 1;
        }
    }
    public static int numIslands(char[][] grid) {
        int n=grid.length,m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j])
                    c+=func(grid,vis,i,j);
            }
        }
        return c;
    }
	public static void main(String[] args) {

        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        int ans = numIslands(grid);
        System.out.println("Number of Islands: " + ans);

	}

}