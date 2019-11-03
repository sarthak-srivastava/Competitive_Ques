class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1)
            return 0;
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        int[][] dp = new int[r][c];
        dp[0][0] = 1;
        for(int i = 0; i<r;i++)
        {
            for(int j = 0; j<c;j++)
            {
                if(i == 0 && j == 0)
                    continue;
                else if(i == 0)
                {
                    if(obstacleGrid[i][j] == 1)
                        dp[i][j] = 0;
                    else
                        dp[i][j] = dp[i][j - 1];
                    
                }
                else if(j == 0)
                {
                    if(obstacleGrid[i][j] == 1)
                        dp[i][j] = 0;
                    else
                        dp[i][j] = dp[i-1][j];
                    
                }
                else
                {   
                    if(obstacleGrid[i][j] == 1)
                        dp[i][j] = 0;
                    else
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[r - 1][c - 1];
    }
}
