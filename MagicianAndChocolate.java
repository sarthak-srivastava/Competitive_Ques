public class Solution {
    public int nchoc(int A, int[] B) {
        PriorityQueue<Long> pq = new PriorityQueue<Long>(Collections.reverseOrder());
        if(B.length == 0)
        return 0;
        for(long i:B)
        {
            pq.add(i);
        }
        long ans = 0;
        long c_=0;
        for(int i = 0; i<A;i++)
        {   long c = pq.remove();
            c_ = c%(1000000000 + 7);
            ans = ans + c_;
            ans = ans%(1000000000 + 7);
            pq.add((long)Math.floor(c/2));
        }
        return (int)ans;
    }
}
