public class Solution {
   public int cntBits(int[] arr) {
        long ans = 0;
        for(int i = 0; i<A.length; i++)
        {
            for(int j = i+1;j<A.length;j++)
            {
                ans += bitDifference(A[i],A[j]);
            }
        }
        ans *=2;
        return (int)ans%(1000000000+7);
    }
    int bitDifference(int a, int b)
    {
        int c = a^b;
        int count = 0;
        for(int i = 0; i<=31;i++)
        {
            if((c&(1<<i))!=0)
            count+=1;
        }
        return count;
    }
    }
