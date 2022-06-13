class Solution {
    public int minimumTotal(List<List<Integer>> triangle) 
    {   
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int i = 0; i<n; i++)
        {
            dp[n-1][i] = triangle.get(n-1).get(i); 
        }
        for(int i = n-2; i>=0; i--)
        {
            for(int j = 0; j<triangle.get(i).size(); j++)
            {
                int left = dp[i+1][j];
                int right = dp[i+1][j+1];
                int curr = triangle.get(i).get(j);
                dp[i][j] = curr + Math.min(left, right);
            }
        }
        return dp[0][0];
    }
}