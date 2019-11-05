class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1)
                return;
        int i = 0;
        for(i = nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
                break;
        }
        if(i == 0)
        {
            Arrays.sort(nums);
            return;
        }
        i--;
        int j = nums.length - 1;
        for(j = nums.length - 1;j>i;j--)
        {
            if(nums[j]>nums[i])
                break;
        }
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
        i = i + 1;
        j = nums.length - 1;
        while(i<j)
        {
            t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
    }
}
