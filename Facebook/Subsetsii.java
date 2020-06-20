public class Solution {
    /**
     * @param nums: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // write your code here
        List<List<Integer>> ans = new ArrayList<>();
        if(nums == null)
            return ans;
        List<Integer> curr = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        subset(ans, nums, 0, curr, hs);
        return ans;
    }
    public void subset(List<List<Integer>> ans, int[] nums, int i, List<Integer> curr, HashSet<List<Integer>> hs)
    {
        if(i == nums.length)
        {   
            List<Integer> tmp = new ArrayList<>(curr);
            Collections.sort(tmp);

            if(!hs.contains(tmp))
            {
                hs.add(tmp);
                ans.add(tmp);
                return;
            }
            return;
        }
        subset(ans, nums, i+1, curr,hs);
        curr.add(nums[i]);
        subset(ans,nums,i+1,curr,hs);
        curr.remove(curr.size() - 1);
        return;
    }
}
