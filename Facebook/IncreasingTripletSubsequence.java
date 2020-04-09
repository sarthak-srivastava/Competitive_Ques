class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length <= 2)
            return false;
        int[] right = new int[nums.length];
        int[] left = new int[nums.length];
        left[0] = Integer.MAX_VALUE;
        right[nums.length - 1] = Integer.MIN_VALUE;
        for(int i = 1; i< nums.length; i++)
            left[i] = Integer.min(nums[i - 1],left[i-1]);
        for(int i = nums.length - 2; i>=0; i--)
        {
            right[i] = Integer.max(nums[i+1], right[i + 1]);
        }
        for(int i = 1; i< nums.length - 1; i++)
        {
            if(left[i] < nums[i] && right[i] > nums[i])
                return true;
        }
        return false;
    }
}

