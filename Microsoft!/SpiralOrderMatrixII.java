public class Solution {
    public int[][] generateMatrix(int A) {
        int[][] arr = new int[A][A];
        int t = 0;
        int l = 0;
        int r = A-1;
        int b = A-1;
        int p = 1;
        int d = 0;
        while(t<=b && l<=r)
        {
            if(d==0)
            {
                for(int i = l;i<=r;i++)
                {
                    arr[t][i] = p;
                    p++;
                    
                }
                t++;
            }
                     if(d==1)
            {
                for(int i = t;i<=b;i++)
                {
                    arr[i][r] = p;
                    p++;
                    
                }
                r--;
            }
                     if(d==2)
            {
                for(int i = r;i>=l;i--)
                {
                    arr[b][i] = p;
                    p++;
                    
                }
                b--;
            }
                     if(d==3)
            {
                for(int i = b;i>=t;i--)
                {
                    arr[i][l] = p;
                    p++;
                    
                }
                l++;
            }
            d = (d+1)%4;
        }
        return arr;
        
    }
}
