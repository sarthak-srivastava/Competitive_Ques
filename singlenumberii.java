class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int sum = 0;
        for(int i = 32;i>=0;i--)
        {
            for(int j = 0; j<nums.length;j++)
            {
                if(((nums[j]>>i)&1) == 1)
                    sum++;
            }
            sum = sum%3;
            if(sum!=0)
                ans = ans|(1<<i);
            sum = 0;
        }
        return ans;
    }
}
