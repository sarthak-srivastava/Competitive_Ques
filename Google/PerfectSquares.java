class Solution {
    public int numSquares(int n) {
        // List<Integer> per_sq = new ArrayList<Integer>();
        // for(int i = 1;  i*i < n;i++)
        // per_sq.add(i*i);
        
        int[] dp = new int[n+1];
        Arrays.fill(dp,n);
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 1; i<= n;i++)
        {   
            for(int j = 1; j*j<=i;j++)
            {
                
                dp[i] = Integer.min(1 + dp[i - j*j],dp[i]);
                
            }
            // dp[i] += 1;
        }
        return dp[n];
    }
}
