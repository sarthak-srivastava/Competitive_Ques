class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1, -1};
        if(nums == null || nums.length <= 0)
            return ans;
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums)
        {
            if(hm.containsKey(target - i))
            {
                ans[0] = hm.get(target - i);
                ans[1] = count;
                return ans;
            }
            else
            {
                hm.put(i, count++);
            }
        }
        return ans;
        
    }
}
