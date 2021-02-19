class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
    // dp[n][k] = stores the final answer and 
    // dp[i][j] = minimum length possible for the string s[:i] with atmost j deletions
        int n = s.length();
        int[][] dp = new int[s.length() + 1][k + 1];
        for(int i = 0; i<dp.length; i++)
            for(int j = 0; j< dp[0].length; j++)
                dp[i][j] = 100000;
        dp[0][0] = 0;
        for(int i = 1; i<= s.length(); i++)
        {

            for(int j = 0; j <= k; j++)
            {
                int count = 0;
                int del = 0;
                for(int l = i; l >=1; l--) // keep s[i], remove different
                {
                    if(s.charAt(l - 1) == s.charAt(i-1))
                        count++;
                    else
                        del++;
                    if(del <= j)
                    dp[i][j] = Integer.min(dp[i][j], dp[l-1][j-del] + 1 + (count >= 100 ? 3 : count >= 10 ? 2 : count >= 2 ? 1: 0));
                }
                if(j > 0)
                dp[i][j] = Integer.min(dp[i][j], dp[i-1][j-1]);

            }

        }
        
                return dp[n][k];
    }
}

