class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums == null || nums.length < 2)
            return ans;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length; i++)
        {
            if(hm.containsKey(target - nums[i]))
            {
                ans[0] = hm.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            hm.put(nums[i], i);
        }
        return ans;
    }
}