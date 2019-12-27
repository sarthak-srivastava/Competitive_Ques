class Solution {
    public int coinChange(int[] coins, int amount) {
        if(coins.length == 0 || amount <=0)
            return 0;
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,max);
        dp[0] = 0;
        for(int i = 1; i<= amount; i++)
        {
            for(int val: coins)
            {
                if(val<=i)
                    dp[i] = Integer.min(dp[i],dp[i - val] + 1);
            }
        }
        
        return dp[amount] > amount? - 1 : dp[amount];
        
        
    }
} 
