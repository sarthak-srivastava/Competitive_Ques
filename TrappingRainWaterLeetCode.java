class Solution {
    public int trap(int[] height) {
        if(height == null || height.length<=2)
            return 0;
        int ans = 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = height[0];
        right[height.length-1] = height[height.length - 1];
        for(int i = 1; i<height.length;i++)
        {
            left[i] = Integer.max(left[i-1],height[i]);
        }
        for(int i = height.length - 2; i>=0;i--)
        {
            right[i] = Integer.max(right[i+1],height[i]);
        }
        for(int i = 1; i<height.length-1;i++)
        {
            int min = Integer.min(left[i],right[i]);
            ans += min - height[i];
        }
        
        return ans;
    }
}
