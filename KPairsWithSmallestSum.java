class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums1 == null || nums2 == null || nums1.length <= 0 || nums2.length <=0)
            return ans;
        
        PriorityQueue<List<Integer>> pq = new PriorityQueue<List<Integer>>((a,b) -> (b.get(0) + b.get(1) - a.get(0) - a.get(1)));
        for(int i = 0; i<Integer.min(k,nums1.length);i++)
        {
            for(int j = 0; j<Integer.min(k,nums2.length); j++)
            {   List<Integer> temp = new ArrayList<>();
                temp.add(nums1[i]);
                temp.add(nums2[j]);
                pq.offer(temp);
                while(pq.size() > k)
                    pq.poll();
            }
        }
        while(pq.size()>0)
            ans.add(pq.poll());
        return ans;
    }
}
