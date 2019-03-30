public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        int[] ans = new int[A.length*A[0].length];
        int q = 0;
        int l = 0;
        int r = A[0].length-1;
        int t = 0;
        int b = A.length-1;
        int dir = 0;
        while(l<=r && t<=b)
        {
            if(dir == 0)
            {
                for(int i = l; i<=r;i++)
                ans[q++]=A[t][i];
                t++;
                
            }
            if(dir == 1)
            {
                for(int i = t;i<=b;i++)
                ans[q++] = A[i][r];
                r--;
                
                
            }
            if(dir == 2)
            {
                for(int i = r;i>=l;i--)
                ans[q++] = A[b][i];
                b--;
                            }
            if(dir == 3)
            {
                for(int i = b;i>=t;i--)
                ans[q++] = A[i][l];
                l++;
                
            }
            dir = (dir+1)%4;
        }
        return ans;
    }
}
