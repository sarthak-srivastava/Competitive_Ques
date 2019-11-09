class Solution {
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int candidate = 0;
        int candidate_frequency = 0;
        for(int i: nums)
        {
            
                int freq = hm.getOrDefault(i,0);
                if(freq + 1 > candidate_frequency)
                {
                    candidate_frequency = freq + 1;
                    candidate = i;
                }
                hm.put(i, freq + 1);
            
        }
        if( candidate_frequency > Math.floor(nums.length/2))
            return candidate;
        return -1;
    }
}
