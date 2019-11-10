class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        if(nums == null || nums.length == 0)
            return ans;
        int start = nums[0];
        int end = nums[0];
        for(int i= 1; i<nums.length; i++)
        {
            if(nums[i] == nums[i - 1] + 1)
            {
                end = nums[i];
            }
            else
            {   if(end>start)
                ans.add(Integer.toString(start)+"->" + Integer.toString(end));
                else
                    ans.add(Integer.toString(start));
                start = nums[i];
                end = nums[i];
            }
        }
        if(end>start)
            ans.add(Integer.toString(start)+"->" + Integer.toString(end));
        else
            ans.add(Integer.toString(start));
        return ans;
    }
}
