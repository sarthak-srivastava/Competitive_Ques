class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int beg = 1;
        int end = 500 * 50000;
        while(beg<=end)
        {
            int mid = (beg) + (end - beg)/2;
            if(isPossible(weights,D,mid) == true)
            {
                end = mid - 1;
            }
            else
                beg = mid + 1;
            
        }
        return beg;
    }
    public boolean isPossible(int[] weights, int D, int cap)
    {
        int d = 1;
        int curr = 0;
        for(int i = 0; i<weights.length;i++)
        {
            if(weights[i]>cap || d>D)
                return false;
            if(weights[i] + curr > cap)
            {
                d++;
                curr = weights[i];
            }
            else
                curr += weights[i];
            
        }
        if(d>D || curr>cap)
            return false;
        return true;
    }
}
