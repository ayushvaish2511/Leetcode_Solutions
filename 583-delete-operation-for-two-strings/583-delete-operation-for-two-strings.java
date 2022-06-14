class Solution {
    public int lcs(String a, String b, int m, int n)
    {
       int[][] dp = new int[m+1][n+1];
       for(int i = 0; i<=m; i++)
       {
           for(int j = 0; j<=n; j++)
           {
               if(i == 0 || j == 0)
               {
                   dp[i][j] = 0;
               }
               else if(a.charAt(i-1) == b.charAt(j-1))
               {
                   dp[i][j] = 1 + dp[i-1][j-1];
               }
               else 
               {
                   dp[i][j] = dp[i-1][j] > dp[i][j-1] ? dp[i-1][j] : dp[i][j-1]; 
               }
           }
       }
       return dp[m][n];
    }
    public int minDistance(String word1, String word2) 
    {
        int m = word1.length();
        int n = word2.length();
        int common = lcs(word1, word2, m, n);
        return (m+n) - 2*common;
    }

}