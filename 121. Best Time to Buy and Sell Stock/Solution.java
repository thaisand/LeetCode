class Solution {
    public int maxProfit(int[] prices) {
        int menor = 999999, profit = 0;
        
        if (prices.length == 1) {
          return 0;  
        }
        else {
          for(int i = 0; i < prices.length; i++) {
            if(prices[i] < menor) {
              menor = prices[i];
            }
            else if(prices[i] - menor > profit) {
                profit = prices[i] - menor;
            }
          }
        }
        return profit;
    }
}
