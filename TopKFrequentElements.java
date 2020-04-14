class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0)
            return new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> fm = new HashMap<>();
        for(int num : nums)
            fm.put(num, fm.getOrDefault(num,0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b) -> (fm.get(a) - fm.get(b)));
        for(int key: fm.keySet())
        {
            pq.offer(key);
            while(pq.size() > k)
                pq.poll();
        }
        while(pq.size() > 0)
            ans.add(pq.poll());
        return ans;
    }
}
