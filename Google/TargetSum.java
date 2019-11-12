class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums == null) 
            return 0;
        int numWays = 0;
        return findTargetSumWays(nums,0,0,S);
    }
    private int findTargetSumWays(int[] nums , int idx, int curr_sum, int S)
    {
        if(idx == nums.length)
        {
            if(curr_sum == S)
                return 1;
            else
                return 0;
        }
        int ways = 0;
        ways = findTargetSumWays(nums,idx+1,curr_sum + nums[idx],S) + findTargetSumWays(nums,idx+1,curr_sum - nums[idx],S);
        return ways;
    }
}
