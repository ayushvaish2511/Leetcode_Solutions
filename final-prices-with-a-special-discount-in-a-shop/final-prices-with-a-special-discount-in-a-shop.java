class Solution {
    public int[] finalPrices(int[] prices) 
    {
        int n = prices.length;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++)
        {
            int disc = 0;
            for(int j = i+1; j<n; j++)
            {
                if(prices[j]<=prices[i])
                {
                    disc = prices[j];
                    break;
                }
            }
            ans[i] = prices[i] - disc;
        }
        return ans;
    }
}