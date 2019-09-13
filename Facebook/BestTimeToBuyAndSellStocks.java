class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
      int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        left[0] = prices[0];
        right[prices.length-1] = prices[prices.length - 1];
        for(int i =1 ;i<left.length;i++)
        {
            left[i] = Integer.min(left[i-1],prices[i]);
        }
        for(int i = prices.length - 2;i>=0;i--)
        {
            right[i] = Integer.max(right[i+1],prices[i]);
        }
        int ans= 0;
        for(int i = 0;i <prices.length;i++)
        {
            ans = Integer.max(ans,right[i] - left[i]);
        }
        return ans<=0?0:ans;
    }
}
