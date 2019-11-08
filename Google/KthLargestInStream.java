class KthLargest {
    int[] num;
    int K;
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> a - b);
    public KthLargest(int k, int[] nums) {
        K = k;
        num = nums;
        for(int i:num)
        {
            pq.add(i);
            while(pq.size()>K)
                pq.remove();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size()>K)
                pq.remove();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
