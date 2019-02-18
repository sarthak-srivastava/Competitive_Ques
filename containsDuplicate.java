class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
                return true;
            hs.add(nums[i]);
        }
        return false;
    }
}
