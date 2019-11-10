class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> ans = new ArrayList<Integer>();
        if(nums == null || nums.length == 0)
            return ans;
        for(int i:nums)
        {
            if(nums[Math.abs(i)-1]>0)
                nums[Math.abs(i) - 1] = - Math.abs(nums[Math.abs(i) - 1]);
            else
                ans.add(Math.abs(i));
        }
        return ans;
    }
}
