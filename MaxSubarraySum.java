class Solution {
    public int maxSubArray(int[] nums) {
        int s= 0;
        int overall = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++)
        {   s = s+nums[i];
            if(s>overall)
            overall = s;
            if(s<0)
                s = 0;
            
            
        }
        
        return overall;
            
    }
}
