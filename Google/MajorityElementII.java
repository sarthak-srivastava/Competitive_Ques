class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //Since we are looking for more than n/3 freq, only two such element are possible at max.
        if(nums == null || nums.length == 0)
            return new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        int can1 = nums[0];
        int can2 = nums[0];
        int count1 = 0;
        int count2 = 0;
        for(int i: nums)
        {
            if(i == can1)
            {
                count1++;
            }
            else if(i == can2)
            {
                count2++;
            }
            else if(count1 == 0)
            {
                can1 = i;
                count1 = 1;
            }
            else if(count2 == 0)
            {
                can2 = i;
                count2 = 1;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i:nums)
        {
            if(can1 == i)
                count1++;
            if(can2 == i)
                count2++;
        }
        if(count1>Math.floor(nums.length/3))
            ans.add(can1);
        if(can1!=can2 && count2>Math.floor(nums.length/3))
            ans.add(can2);
        return ans;
    }
}
