class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while(j<nums.length)
        {
            if(nums[j] == 0)
            {   j++;
                continue;
            }
            else
            {
                nums[i] = nums[j];
                i++;
                j++;
            }
            
        }
        while(i<nums.length)
        {
            nums[i++] = 0;
        }
        
    }
}
