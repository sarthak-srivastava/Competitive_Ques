class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;
        HashSet<Integer> hs = new HashSet<Integer>();
        int count = 1;
        int ans = 1;
        for(int i:nums)
        {
                hs.add(i);

            }
        for(int i:nums)
        {   count = 1;
         if(hs.contains(i-1))
             continue;
            if(hs.contains(i+1))
            {   int j = i;
                while(hs.contains(j+1))
                {
                    count++;
                    j = j + 1;
                }
             ans = Integer.max(count,ans);
            }
        }
         ans = Integer.max(count,ans);
        return ans;
    }
}
