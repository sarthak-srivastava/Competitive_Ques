class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length <= 2)
            return false;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i: nums)
        {
            if(i <= first)
                first = i;
            else if (i <= second)
                second = i;
            else
                return true;
        }
        return false;
    }
}


