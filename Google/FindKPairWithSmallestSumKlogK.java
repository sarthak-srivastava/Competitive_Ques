class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums1 == null || nums2 == null || nums1.length <= 0 || nums2.length <=0)
            return ans;
        
        PriorityQueue<List<Integer>> pq = new PriorityQueue<List<Integer>>((a,b) -> (a.get(0) + a.get(1) - b.get(0) - b.get(1)  ));
        for(int i = 0; i<Integer.min(k,nums1.length);i++)
        {  List<Integer> temp = new ArrayList<>();
                temp.add(nums1[i]);
                temp.add(nums2[0]);
                temp.add(0);
            pq.add(temp);
        }
            while(k-->0 && pq.size() > 0)
            { 
                List<Integer> curr = pq.poll();
                List<Integer> temp = new ArrayList<>();
                temp.add(curr.get(0));
                temp.add(curr.get(1));
                ans.add(temp);
                if(curr.get(2) >= nums2.length - 1)
                    continue;
                curr.set(1 , nums2[curr.get(2) + 1]);
                curr.set(2,curr.get(2) + 1);
                pq.add(curr);
            }
        
       
        return ans;
    }
}
