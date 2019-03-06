public class Solution {
    public int maxSpecialProduct(int[] A) {
        int mod = 1000000007;
        long lsv = 0;
        long rsv = 0;
        long ans = 0;
        for(int i = 1;i<A.length-1;i++)
        {
            lsv = 0;
            rsv = 0;
            for(int j = i-1;j>0;j--)
            {
                if(A[j]>A[i])
             {  lsv = j;
                break;
            }
            }
            
            for(int j = i+1;j<A.length;j++)
            {
                if(A[j]>A[i])
                {
                    rsv = j;
                    break;
                    
                }
            }
            ans = Long.max(lsv*rsv,ans);
        }
        return (int)ans%mod;
    }
}
