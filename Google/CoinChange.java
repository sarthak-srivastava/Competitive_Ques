class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0)
            return 0;
        if(coins == null || coins.length == 0)
            return -1;
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 1;i<=amount; i++)
        {
            for(int j = 0; j<coins.length; j++)
            {   if(i>=coins[j])
                dp[i] = Integer.min(dp[i],1 + dp[i - coins[j]]);
                
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
