class Solution {
    public int trap(int[] height) {
        int lo = 0;
        int hi = height.length - 1;
        int left_max = 0;
        int right_max = 0;
        int ans = 0;
        while(lo<=hi)
        {
         if(height[lo] < height[hi])
         {
            if(left_max<height[lo])
            {
                left_max = height[lo];
            }
             else
                 ans += left_max - height[lo];
             lo++;
         }
        else
        {
            if(right_max < height[hi])
                right_max = height[hi];
            else
                ans += right_max - height[hi];
            hi--;
        }
        }
        return ans;
    }
}
