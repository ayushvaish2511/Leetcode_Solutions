class Solution {
    public int maxProfit(int[] prices) {
        int sell_price = prices[prices.length-1];               //Stores the max value coming after the smallest value
        int difference = 0;                                    //We have make this maximum i.e. profit
        for(int i = prices.length-2; i>=0; i--)
        {
            if(prices[i]>sell_price)
            {
                sell_price = prices[i];
            }
            else if(sell_price-prices[i] > difference)
            {
                difference = sell_price-prices[i];
            }   
        }
        return difference;
        
    }
}