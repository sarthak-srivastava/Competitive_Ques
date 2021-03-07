public class Solution {
    public int mice(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i<A.length; i++)
            ans = Integer.max(ans, Math.abs(A[i] - B[i]));
        return ans;
    }
}
