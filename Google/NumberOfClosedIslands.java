class Solution {
    public int closedIsland(int[][] grid) {
        
    for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[i].length - 1) {
                    fill(grid, i, j);
                }
            }
        }
         for(int i = 1;i<grid.length - 1;i++)
        {
         if(grid[i][0] == 0)
             fill(grid,i,0);
          if(grid[i][grid[0].length - 1] == 0) 
              fill(grid,i,grid.length - 1);}
             int ans = 0;
             for(int i = 1; i<grid.length-1;i++)
             {
                 for(int j = 1; j<grid[0].length-1;j++)
                 {
                     
                     if(grid[i][j] == 0)
                     {
                         ans++;
                         fill(grid,i,j);
                         
                     }
                 }
             }
             return ans;
        }
        
    
    public void fill(int[][] grid, int i, int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==1 )
            return;
        grid[i][j] = 1;
        fill(grid,i+1,j);
        fill(grid,i-1,j);
        fill(grid,i,j+1);
        fill(grid,i,j-1);
    }
}
