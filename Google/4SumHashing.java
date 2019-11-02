class Solution {
    public static class pair{
        int first, second;
        pair(int f, int s)
        {
            first = f;
            second = s;
        }
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
        HashMap<Integer,pair> hm = new HashMap<Integer,pair>();
        for(int i = 0;i<nums.length - 1; i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                int sum = nums[i] + nums[j];
                hm.put(sum,new pair(nums[i],nums[j]));
            }
        }
        for(int i = 0;i<nums.length - 1; i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                int sum = nums[i] + nums[j];
                if(hm.containsKey(target - sum))
                {
                    pair temp = hm.get(target - sum);
                    int first = temp.first;
                    int second = temp.second;
                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(first);
                    tmp.add(second);
                    if(!hs.contains(tmp))
                    {
                        hs.add(tmp);
                        ans.add(tmp);
                    }
                }
                
            }
        }
        return ans;
        
    }
}
