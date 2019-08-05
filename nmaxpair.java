public class Solution {
    public int[] solve(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = A.length - 1; i>=0;i--)
        {
            for(int j = B.length - 1; j>=0;j--)
            {
                int s= A[i]+B[j];
                if(pq.size() == A.length)
                {
                    if(s>pq.peek())
                    {pq.remove();
                    pq.add(s);
                        
                    }
                }
                else
                pq.add(s);
            }
        }
        int c = 0;
        int[] ans = new int[A.length];
        for(int i:pq)
        ans[c++] = i;
        int[] ans_ = new int[A.length];
        for(int i = A.length - 1; i>=0;i--)
        ans_[A.length-1-i] = ans[i];
        return ans_;
}
}
