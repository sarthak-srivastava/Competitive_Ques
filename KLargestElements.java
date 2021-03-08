public class Solution {
    public int[] solve(int[] A, int B) {
        int[] ans = new int[B];
        if(A == null || A.length == 0)
            return ans;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> (b - a));
        for(int i:A)
            pq.add(i);
        int c = 0 ;
        while(B-->0)
            ans[c++] = pq.poll();
        return ans;
    }
}
