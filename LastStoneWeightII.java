class Solution {
    public int lastStoneWeightII(int[] stones) {
        if(stones == null || stones.length == 0)
            return 0;
        int s = 0;
        for(int i:stones)
            s += i;
        
        boolean[][] dp = new boolean[stones.length+1][s+1];
        for(int i = 0;i<=stones.length;i++)
            dp[i][0] = true;
        int s2 = 0;
        for(int i = 1; i<=stones.length;i++)
        {
            for(int j = 1; j<=s/2;j++)
            {
                if(dp[i - 1][j] == true || (j>=stones[i - 1] && dp[i - 1][j -  stones[i-1]] == true))
                {
                    dp[i][j] = true;
                    s2 = Integer.max(s2,j);
                }
            }
        }
        return s - 2 * s2;
        
    }
}
