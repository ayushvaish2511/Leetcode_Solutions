class Solution {
    public int lengthOfLIS(int[] nums) 
    {
        SortedSet<Integer> se = new TreeSet<>();
        for(int i : nums)
        {
            se.add(i);
        }
        int[] lis = new int[se.size()];
        int k = 0;
        for(Integer it : se)
        {
            lis[k++] = it.intValue();
        }
        int m = nums.length;
        int n = lis.length;
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i<=m; i++)
        {
            for(int j = 0; j<=n; j++)
            {
                if(i == 0 || j == 0)
                {
                    dp[i][j] = 0;
                }
                else 
                {
                    dp[i][j] = -1;
                }
            }
        }
        for(int i = 1; i<=m; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                if(nums[i-1] == lis[j-1])
                    dp[i][j] = 1 + dp[i-1][j-1];
                else 
                    dp[i][j] = (int)Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}