class Solution {
    public int minFallingPathSum(int[][] A) {
        if(A.length == 0)
        return 0;
        int[][] dp = new int[A.length][A[0].length];
        for(int i = 0; i<A[0].length; i++)
        {
            dp[0][i] = A[0][i];
        }
        for(int i = 1; i<A.length; i++)
        {
            for(int j = 0; j<A[0].length;j++)
            {
                dp[i][j] = A[i][j] + Integer.min(dp[i-1][j],Integer.min(j-1>=0 ?dp[i-1][j-1] : Integer.MAX_VALUE, j+1<A[0].length ? dp[i-1][j+1]:Integer.MAX_VALUE));
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i:dp[A.length - 1])
            ans = Integer.min(ans,i);
        return ans;
        
    }
}
