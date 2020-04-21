class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length < 3)
            return ans;
        Arrays.sort(nums);
        
        int j, k;
        j = 1;
        for(int i = 0; i< nums.length; i++)
        {
            j = i + 1;
            k = nums.length - 1;
            if(i>0 && nums[i] == nums[i-1])
                continue;
            while(k>j)
            {
                if(k < nums.length - 1 && nums[k] == nums[k + 1])
                {  k--;
                continue;
                }
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0)
                {
                    k--;
                }
                else if(sum < 0)
                {    j++;
                
                }
                else
                {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    ans.add(tmp);
                    j++;
                    k--;
                }
                
            }
            
        }
        return ans;
    }
}
