public class Solution {
    public int[][] generateMatrix(int A) {
        int[][] ans = new int[A][A];
        int l = 0;
        int r = A-1;
        int t = 0;
        int b = A-1;
        int dir = 0;
        int k = 1;
        while(l<=r && t<=b)
        {
            if(dir == 0)
            {
                for(int i = l;i<=r;i++)
                {
                    ans[t][i] = k;
                    k++;
                    
                }
                t++;
                
            }
            if(dir == 1)
            {
                for(int i = t;i<=b;i++)
                {ans[i][r] = k;
                k++;
                }
                r--;
            }
            if(dir == 2)
            {
                for(int i = r;i>=l;i--)
                {
                    ans[b][i] = k;
                    k++;
                }
                b--;
            }
            if(dir == 3)
            {
                for(int i = b;i>=t;i--)
                {
                    ans[i][l]= k;
                    k++;
                }
                l++;
            }
            dir = (dir+1)%4;
        }
        return ans;
    }
}
