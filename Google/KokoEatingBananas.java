class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        // Arrays.sort(piles);
        int min = 1;
        int max = 1000000007;
        while(min<max)
        {
            int mid = (min) + (max - min)/2;
//             if(valid(piles,mid,H) == 0)
//             {
//                 ans =  mid;
                
//             }
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
            time += (p-1) / k + 1;
        return  ((long)time - (long)H);
        
    }
}
