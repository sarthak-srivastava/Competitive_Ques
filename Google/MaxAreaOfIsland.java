class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int curr_area = 0;
        int max_area = 0;
        for(int i = 0;i<grid.length;i++)
        {
            for(int j = 0; j<grid[i].length;j++)
            {
                if(grid[i][j] == 1)
                {   
                    max_area = Integer.max(max_area,dfs(grid,i,j));
                }
            }
        }
        return max_area;
    }
    public int dfs(int[][] grid, int i, int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>= grid[0].length || grid[i][j] == 0)
            return 0;
        grid[i][j] = 0;
        int curr_area = 1;
        // max_area = Integer.max(max_area,curr_area);
        curr_area += dfs(grid,i+1,j);
        curr_area += dfs(grid,i-1,j);
        curr_area += dfs(grid,i,j+1);
        curr_area += dfs(grid,i,j-1);
        return curr_area;
        
            
    }
}
