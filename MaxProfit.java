package leetcode_solutions;

class Solution {
    public int maxProfit(int[] prices) {
      int minPriceStock = Integer.MAX_VALUE, mprofit = 0;
        
      for(int i = 0; i<prices.length; i++){
          if(prices[i] < minPriceStock)
            minPriceStock = prices[i];
          
          else if(prices[i] - minPriceStock > mprofit)
            mprofit = prices[i] - minPriceStock;
      }
       
      return mprofit;
    }
}