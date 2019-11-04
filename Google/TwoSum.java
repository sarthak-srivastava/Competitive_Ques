class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length<2)
        {
            return new int[2];
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        // HashMap to store element vs index for constant av. time lookup
        for(int i = 0; i<nums.length;i++)
        {
            if(hm.containsKey(target - nums[i]))
            {
                return new int[]{hm.get(target - nums[i]),i};
            }
            hm.put(nums[i],i);
        }
        return new int[2];
    }
}
