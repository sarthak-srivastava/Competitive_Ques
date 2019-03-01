class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        Arrays.fill(lis,1);
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++)
        {
            for(int j = 0;j<i;j++)
            {
                if(nums[j]<nums[i] && lis[i]<=lis[j])
                { lis[i] = 1 + lis[j];
                    if(max<lis[i])
                        max = lis[i];
                }
            }
        }
        return max;
    }
}
