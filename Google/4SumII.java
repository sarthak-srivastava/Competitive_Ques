class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i<A.length; i++)
        {
            for(int j = 0; j<B.length; j++)
            {
                hm.put( A[i] + B[j] , hm.getOrDefault(A[i] + B[j],0) + 1);
            }
        }
        int ans = 0;
        for(int i = 0; i<C.length; i++)
        {
            for(int j = 0; j<D.length; j++)
            {
                ans += hm.getOrDefault(-(C[i] + D[j]),0);
            }
        }
        return ans;
    }
}
