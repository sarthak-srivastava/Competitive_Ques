class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        int ans = 0;
        int sum = 0;
        for(int i:nums)
        {   sum+= i;
            if(sum == k)
                ans++;
            if(hs.containsKey(sum - k))
                ans += hs.get(sum - k);
            hs.put(sum,hs.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
