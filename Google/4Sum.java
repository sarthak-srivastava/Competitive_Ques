class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
        for(int i = 0;i<nums.length - 3;i++)
        {
            for(int j = i + 1; j<nums.length-2;j++)
            {
                int l = j+1;
                int r = nums.length - 1;
                while(l<r){
                int sum = nums[i]+nums[j]+nums[l]+nums[r];
                if(sum>target)
                    r--;
                if(sum<target)
                    l++;
                if(sum == target)
                {
                    ArrayList<Integer> curr = new ArrayList<Integer>();
                    curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(nums[l]);
                    curr.add(nums[r]);
                    l++;
                    r--;
                    if(!hs.contains(curr))
                    {   hs.add(curr);
                        ans.add(curr);}
                }
            }
            }
        }
        return ans;
    }
}
