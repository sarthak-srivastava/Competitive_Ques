class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int i = 1;
        int j = 2;
        int count = 0;
        while(j<nums.length)
        {
            if(nums[j] == nums[i] && nums[j] == nums[i - 1])
            {
                j++;
                count++;
            }
            else
            {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return nums.length - count;
        
    }
}
