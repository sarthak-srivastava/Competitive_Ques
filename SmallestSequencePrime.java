public class Solution {
    public int[] solve(int A, int B, int C, int D) {
        int[] res = new int[D];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Map<Integer,Integer> mp = new HashMap<>();
        // mp.(1);
        pq.add(1);
        int i = 0;
        while(pq.size()!=0)
        {
            int j = pq.poll();
            if(j>1)
            {
                res[i] = j;
                i++;
            }
            if(i>=D)
            break;
            if(!mp.containsKey(j*A))
            {
                pq.add(j*A);
                mp.put(j*A,1);
            }
            if(!mp.containsKey(j*B))
            {
                pq.add(j*B);
                mp.put(j*B,1);
            }
            if(!mp.containsKey(j*C))
            {
                pq.add(j*C);
                mp.put(j*C,1);
            }
        }
        return res;
        }

        // return Arrays.copyOfRange(result,1,D+1);
    // }
}
