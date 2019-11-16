class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] lr = new int[grid.length];
        int[] tb = new int[grid[0].length];
        
        for(int i = 0; i<grid.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<grid[0].length;j++)
            {
                max = Integer.max(max,grid[i][j]);
            }
            lr[i] = max;
        }
         for(int i = 0; i<grid[0].length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<grid.length;j++)
            {
                max = Integer.max(max,grid[j][i]);
            }
            tb[i] = max;
        }
        
        int ans = 0;
         for(int i = 0; i<grid.length; i++){
            // int max = Integer.MIN_VALUE;
            for(int j = 0; j<grid[0].length;j++)
            {
               ans += Integer.min(lr[i],tb[j]) - grid[i][j] > 0 ? Integer.min(lr[i],tb[j]) - grid[i][j] : 0;
            }
            // lr[i] = max;
        }
        return ans;
    }
}
