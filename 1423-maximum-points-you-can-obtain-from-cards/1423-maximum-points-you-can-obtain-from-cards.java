class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int s = 0;
        for(int i = 0; i<k; i++)
        {
            s += cardPoints[i];
        }
        int ans = s;
        int j = cardPoints.length - 1;
        while(k>0)
        {
            s = s - cardPoints[k-1] + cardPoints[j];
            ans = ans > s ? ans : s;
            j--;
            k--;
        }
        return ans;
    }
}