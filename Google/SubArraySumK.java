class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix_sum = new int[nums.length+1];
        prefix_sum[0] = 0;
        for(int i = 1; i<=nums.length; i++)
        {
            prefix_sum[i] = prefix_sum[i - 1] + nums[i-1];
        }
        // HashSet<Integer> hs = new HashSet<>();
        int ans = 0;
        for(int i = 0; i<nums.length; i++)
        {
            for(int j = i + 1; j<=nums.length; j++)
            {
                if(prefix_sum[j] - prefix_sum[i] == k)
                    ans++;
            }
        }
        return ans;
    }
}
