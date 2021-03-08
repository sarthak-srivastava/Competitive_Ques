public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<A.length; i++)
        {
            if(min>A[i])
                min = A[i];
            else
                {ans += A[i] - min;
                min = A[i];}
                
        }
        return ans;
    }
}
