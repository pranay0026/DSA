class Solution {
    public int maxProfit(int[] prices) {
     int max_value=prices[prices.length-1];
     int profit=0;
     for(int i=prices.length-2;i>=0;i--)   {
        if(prices[i]>max_value){
            max_value=prices[i];
        }
        profit=Math.max(profit,max_value-prices[i]);
     }
     return profit;
    }
}