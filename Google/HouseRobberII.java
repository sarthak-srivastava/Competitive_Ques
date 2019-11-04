class Solution {
    public int rob(int[] nums) {
     if(nums == null || nums.length == 0)
         return 0;
        
     if(nums.length == 1)
            return nums[0];
     // define possible start points and their corresponding end points in qb
        int max1 = robHelper(nums,0,nums.length - 2);
        int max2 = robHelper(nums,1,nums.length - 1);
        return Integer.max(max1,max2);
    }
    public int robHelper(int[] nums, int i, int j)
    {   if(i == j)
            return nums[j];
        int[] dp = new int[nums.length];
        dp[i] = nums[i];
        dp[i+1] = Integer.max(nums[i],nums[i+1]);
        for(int k = i+2;k<nums.length;k++)
        {
            dp[k] = Integer.max(dp[k-1],nums[k] + dp[k - 2]);
        }
        return dp[j];
    }
}
