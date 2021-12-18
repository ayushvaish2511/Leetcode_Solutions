class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int m = accounts.length;
        int n = accounts[0].length;
        for(int i = 0; i<m; i++)
        {
            int sum = 0;
            for(int j = 0; j<n; j++)
            {
                sum = sum + accounts[i][j];
            }
            if(sum>max)
                max = sum;
        }
        return max;
    }
}