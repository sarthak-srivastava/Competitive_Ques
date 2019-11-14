class Solution {
    public boolean isPossible(int[] nums) {
        if(nums == null || nums.length<3)
            return false;
        HashMap<Integer,Integer> freq = new HashMap<>(), expectedfreq = new HashMap<>();
        for(int i: nums)
        {
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int i: nums)
        {
            if(freq.get(i) == 0)
                continue; // We have exhausted all integer i in making some subsequence or the other
            else if(expectedfreq.getOrDefault(i,0)>0)
            {
                expectedfreq.put(i,expectedfreq.getOrDefault(i,0) - 1);
                expectedfreq.put(i+1,expectedfreq.getOrDefault(i+1,0) + 1);
            }
            else if(freq.getOrDefault(i+1,0)>0 && freq.getOrDefault(i+2,0)>0)
            {
                freq.put(i+1,freq.get(i+1) - 1);
                freq.put(i+2,freq.get(i+2) - 1);
                expectedfreq.put(i+3,expectedfreq.getOrDefault(i+3,0) + 1);
            }
            else
                return false;
            freq.put(i,freq.get(i) - 1);
        }
        return true;
        
    }
}
