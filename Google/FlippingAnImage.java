class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i<A.length;i++)
        {
            int j = 0, k = A.length - 1;
            while(j<=k)
            {
                int t = A[i][j];
                A[i][j] = 1 - A[i][k];
                A[i][k] = 1 - t;
                j++;
                k--;
            }
        }
        return A;
    }
}
