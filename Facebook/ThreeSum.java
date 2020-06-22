class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums == null || nums.length < 3)
            return ans;
        Arrays.sort(nums);
        for(int i = 0; i< nums.length - 2; i++)
        {
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j<k)
            {
                if(k < nums.length - 1 && nums[k] == nums[k+1])
                {
                    k--;
                    continue;
                }
                int sum = nums[i] + nums[k] + nums[j];
                if(sum < 0)
                {
                    j++;
                }
                else if(sum > 0)
                {
                    k--;
                }
                else
                {
                    List<Integer> curr = new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(nums[k]);
                    ans.add(curr);
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
}
