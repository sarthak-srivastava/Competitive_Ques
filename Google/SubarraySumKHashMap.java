class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix_sum = new int[nums.length];
        prefix_sum[0] = nums[0];
        for(int i = 1; i<nums.length; i++)
        {
            prefix_sum[i] = prefix_sum[i - 1] + nums[i];
        }
        HashMap<Integer,Integer> hs = new HashMap<>();
        int ans = 0;
        for(int i:prefix_sum)
        {   if(i == k)
            ans++;
            if(hs.containsKey(i - k))
                ans+= hs.get(i - k);
            // else
                hs.put(i,hs.getOrDefault(i,0)+1);
        }
        return ans;
    }
}
