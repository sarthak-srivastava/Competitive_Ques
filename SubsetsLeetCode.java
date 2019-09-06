class Solution {
    HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsetUtil(ans,new ArrayList<Integer>(), -1,nums);
        return ans;
    }
    public void subsetUtil(List<List<Integer>> ans, ArrayList<Integer> curr, int i, int[] nums)
    {
        if(i == nums.length-1)
        {   if(!hs.contains(curr)){
            ans.add(new ArrayList<Integer>(curr));
           hs.add(curr);
        }
            return;
        }
        for(int j = i+1;j<nums.length; j++)
        {
            curr.add(nums[j]);
                subsetUtil(ans,curr,j,nums);
            curr.remove(curr.size()-1);
                subsetUtil(ans,curr,j,nums);
        }
    }
}
