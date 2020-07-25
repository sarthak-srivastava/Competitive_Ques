class Solution {
    public int maxSubArray(int[] nums) {
        int global = Integer.MIN_VALUE;
        int local = 0;
        for(int i: nums)
        {
            local += i;
            if(local > global)
                global = local;
            if(local < 0)
                local = 0;
        }
    return global;
    }
}
