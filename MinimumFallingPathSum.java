class Solution {
    public int minFallingPathSum(int[][] A) {
        int[][] qb = new int[A.length][A[0].length+1];
        for(int i = 0;i<A[0].length;i++)
        {
            qb[A.length-1][i] = A[A.length-1][i] ;
        }
        for(int i = 0;i<A.length;i++)
        qb[i][A[0].length] = Integer.MAX_VALUE;
        for(int i=A.length-2;i>=0;i--)
        {
            for(int j = 0;j<A[0].length;j++)
            {   if((j-1)>=0)
                qb[i][j] =A[i][j]+ Integer.min(qb[i+1][j],Integer.min(qb[i+1][j+1],qb[i+1][j-1]));
             else
                 qb[i][j] =A[i][j]+ Integer.min(qb[i+1][j],qb[i+1][j+1]);
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<A[0].length;i++)
        {   
            ans = Integer.min(ans,qb[0][i]);
        }
        return ans;
    }
}
