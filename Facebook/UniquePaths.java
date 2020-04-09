class Solution {
    public int uniquePaths(int m, int n) {
        if(m <=0 || n<=0)
            return 0;
        if(m == 1 || n == 1)
            return 1;
        int[][] dp = new int[m][n];
        dp[0][1] = 1; // One way to move from 0,0 to 0,1 that is, to move right
        dp[1][0] = 1; // One way to move from (0,0) to (1,0), that is, move down
        for(int i = 1; i< m; i++)
        {
            for(int j = 1; j<n; j++)
            {
                dp[i][j] = (i-1 == 0 ? 1 : dp[i-1][j]) + (j-1 == 0 ? 1 : dp[i][j - 1]);
            }
        }
        return dp[m-1][n-1];
    }
}
