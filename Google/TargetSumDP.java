class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums == null) 
            return 0;
        int numWays = 0;
        int[][] dp = new int[nums.length][2001];
        for (int[] row: dp)
            Arrays.fill(row, Integer.MIN_VALUE);
        return findTargetSumWays(nums,0,0,S,dp);
    }
    private int findTargetSumWays(int[] nums , int idx, int curr_sum, int S, int[][] dp)
    {
        if(idx == nums.length)
        {
            if(curr_sum == S)
                return 1;
            else
                return 0;
        }
        if(dp[idx][curr_sum + 1000]!= Integer.MIN_VALUE)
            return dp[idx][1000 + curr_sum];
        dp[idx][1000 + curr_sum] = findTargetSumWays(nums,idx+1,curr_sum + nums[idx],S,dp) + findTargetSumWays(nums,idx+1,curr_sum - nums[idx],S,dp);
        return dp[idx][1000 + curr_sum];
    }
}
