class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        int maxlen = 0;
        for(int i = 0 ; i<matrix.length ; i++)
        {
            for(int j = 0; j<matrix[0].length ; j++)
            {   if(i == 0 && j == 0)
                dp[i][j] = matrix[i][j] == '1'?1:0;
                else if(i == 0 || j == 0)
                {
                    dp[i][j] = matrix[i][j] == '1'?1:0;
                }
             else
             {
                 if(matrix[i][j] == '1')
                 {
                     dp[i][j] = Integer.min(Integer.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]) + 1;
                     
             }
             }
             maxlen = Integer.max(maxlen,dp[i][j]);
            }
        }
        return maxlen*maxlen;
    }
}
