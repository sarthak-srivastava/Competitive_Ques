class Solution {
    public int minDistance(String word1, String word2) {
        int s1 = word1.length();
        int s2 = word2.length();
        int[][] dp = new int[s1+1][s2+1];
        dp[0][0] = 0;
        for(int i = 0; i <= s1; i++)
        {
            for(int j = 0; j<= s2; j++)
            {
                if(i == 0)
                    dp[i][j] = j;
                else if(j == 0)
                    dp[i][j] = i;
                else
                {if(word1.charAt(i - 1) == word2.charAt(j - 1))
                {
                    dp[i][j] = dp[i-1][j-1];
                }
                else
                    dp[i][j] = 1  + Integer.min(Integer.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
            }
            }
        }
        return dp[s1][s2];
    }
}
