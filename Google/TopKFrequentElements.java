class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
     List<Integer> ans = new ArrayList<Integer>();
        if(nums == null || nums.length < k)
            return ans;
        HashMap<Integer, Integer> numFreq = new HashMap<>();
        for(int i: nums)
        {
            numFreq.put(i,numFreq.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> (numFreq.get(a) - numFreq.get(b)));
        for(int i: numFreq.keySet())
        {
            pq.add(i);
            if(pq.size()>k)
                pq.remove();
        }
        while(pq.size() >0)
        {
            ans.add(pq.remove());
        }
        return ans;
    }
}
