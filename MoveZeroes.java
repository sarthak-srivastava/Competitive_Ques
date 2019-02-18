class Solution {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int j = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == 0)
                continue;
        
            nums[j++] = nums[i];
        }
        for(int k = j;k<nums.length;k++)
            nums[k] = 0;
        
    }
}
