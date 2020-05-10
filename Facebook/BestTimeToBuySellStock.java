public class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        int maxProfit = Integer.MIN_VALUE;
        int curr_min = prices[0];
        for(int i = 1; i< prices.length; i++)
        {
            if(prices[i] < curr_min)
                curr_min = prices[i];
            else
                maxProfit = Integer.max(maxProfit, prices[i] - curr_min);
        }
        return maxProfit == Integer.MIN_VALUE ? 0 : maxProfit;
    }
}
