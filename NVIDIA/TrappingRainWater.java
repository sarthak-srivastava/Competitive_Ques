class Solution {
    public int trap(int[] height) {
        if(height == null || height.length < 2)
         return 0;
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        int ans = 0;
        while(i <= j)
        {
            if(height[i] < height[j])
            {
                left= Integer.max(left, height[i]);
                ans += left - height[i];
                i++;
            }
            else
            {
                right = Integer.max(right, height[j]);
                ans += right - height[j];
                j--;
            }
        }
        return ans;
        
    }
}
