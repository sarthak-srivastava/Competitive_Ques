class Solution {
    public int maxProfit(int[] prices) {
          if (prices==null || prices.length == 0){
            return 0;
        }
        int totalProfit = 0;
        int minPrice = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else {
                totalProfit = totalProfit + (prices[i] - minPrice);
                minPrice=prices[i];
                
            }
        }
        return totalProfit;
    }
}
