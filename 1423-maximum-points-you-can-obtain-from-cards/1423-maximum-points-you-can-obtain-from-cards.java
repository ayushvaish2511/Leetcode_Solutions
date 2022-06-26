class Solution {
    public int maxScore(int[] cardPoints, int k) 
    {
        int n = cardPoints.length;
        int s = 0;
        // int[] prefix = new int[n];
        // prefix[0] = cardPoints[0];
        for(int i = 0; i<k; i++)
        {
            // prefix[i] = prefix[i-1] + cardPoints[i];
            s += cardPoints[i];
        }
        // int[] postfix = new int[n];
        // postfix[n-1] = cardPoints[n-1];
        // for(int i = n-2; i>=0; i--)
        // {
        //     postfix[i] = postfix[i+1] + cardPoints[i];
        // }
        int ans = s;
        int j = n-1;
        while(k>0)
        {
            s = s - cardPoints[k-1] + cardPoints[j];
            ans = Math.max(ans, s);
            j--;
            k--;
        }
        return ans;
    }
}