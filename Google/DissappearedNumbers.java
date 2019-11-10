class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        if(nums==null || nums.length == 0)
            return ans;
        for(int i:nums)
        {   
            nums[Math.abs(i) - 1] = - Math.abs(nums[Math.abs(i) - 1]);
        }
        for(int i = 0 ; i<nums.length;i++)
        {
            if(nums[i]>0)
                ans.add(i+1);
        }
        return ans;
    }
}
