class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) ->(b-a));
        for(int i:stones)
            pq.add(i);
        
        while(pq.size()>=2)
        {
            int largest = pq.remove();
            int sec_largest = pq.remove();
            int diff = largest - sec_largest;
            if(diff>0)
                pq.add(diff);
        }
        
        int ans = 0;
        if(pq.size()>0)
            ans = pq.remove();
        return ans;
    }
}
