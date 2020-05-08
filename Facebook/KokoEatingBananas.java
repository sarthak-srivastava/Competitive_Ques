public class Solution {
    /**
     * @param piles: an array
     * @param H: an integer
     * @return: the minimum integer K
     */
    public int minEatingSpeed(int[] piles, int H) {
        // Write your code hereint min = 1;
        int max = 1000000007;
        int min = 1 ;
        while(min<max)
        {
            int mid = (min) + (max - min)/2;
            if(valid(piles,mid,H) >0)
            {
                min = mid + 1;
            }
            else
                max = mid ;
        }
        return min;
    }
    public long valid(int[] piles, int k, int H)
    {
   int time = 0;
        for (int p: piles)
            time += (p + k - 1) / k;
        return  ((long)time - (long)H);
}
}
