class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<Integer>();
        permuteUtil(nums,ans,curr);
        return ans;
    }
    public static void permuteUtil(int[] nums, List<List<Integer>> ans, ArrayList<Integer> curr)
    {
        if(curr.size() == nums.length)
        {
            ans.add(new ArrayList<Integer>(curr));
            return;
        }
        for(int j = 0;j<nums.length;j++)
        {   if(curr.contains(nums[j]))
            continue;

            curr.add(nums[j]);
            permuteUtil(nums,ans,curr);
            curr.remove(curr.size() - 1);
            
        }
    }
}
