class Solution {
    public int lengthOfLIS(int[] nums) {
        return lengthofLIS(nums,Integer.MIN_VALUE,0);
    }
    public static int lengthofLIS(int[] nums, int prev, int curpos)
    {
        if(curpos == nums.length)
            return 0;
        int taken = 0;
        if(nums[curpos]>prev)
            taken = 1+lengthofLIS(nums,nums[curpos],curpos+1);
        int not_taken = lengthofLIS(nums,prev,curpos+1);
        return Integer.max(taken,not_taken);
    }
}
