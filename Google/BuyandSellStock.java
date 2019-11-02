class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0 ;i<prices.length;i++)
        {
            if(prices[i]<minprice)
                minprice = prices[i];
            if((prices[i] - minprice)>max_profit)
            {
                max_profit = prices[i] - minprice;
            }
        }
        return max_profit;
    }
}
