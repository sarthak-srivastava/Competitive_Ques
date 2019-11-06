class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    if(nums == null || nums.length <=0 )
        return ans;
    permuteHelper(nums,ans,new ArrayList<Integer>(),new HashSet<Integer>(),new HashSet<ArrayList<Integer>>());
    return ans;
    }
    
    public void permuteHelper(int[] nums, List<List<Integer>> ans, ArrayList<Integer> curr,HashSet<Integer> hs_curr,HashSet<ArrayList<Integer>> hs)
    {
        if(curr.size()==nums.length)
        {
            if(!hs.contains(curr))
                ans.add(new ArrayList<Integer>(curr));
            return;
        }
        for(int j = 0; j<nums.length;j++)
        {   
            if(hs_curr.contains(nums[j]))
            continue;
            hs_curr.add(nums[j]);
            curr.add(nums[j]);
            permuteHelper(nums,ans,curr,hs_curr,hs);
            curr.remove(curr.size() - 1);
            hs_curr.remove(nums[j]);
            
        }
    }
    
}
