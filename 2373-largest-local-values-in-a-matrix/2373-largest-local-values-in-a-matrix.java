class Solution {
    public int solve(int m, int n, int[][] grid)
    {
        int max = grid[m][n];
        for(int i = m; i<=m+2; i++)
        {
            for(int j = n; j<=n+2; j++)
            {
                if(grid[i][j] > max)
                {
                    max = grid[i][j];
                }
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) 
    {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<n-2; i++)
        {
            for(int j = 0; j<n-2; j++)
            {
                ans[i][j] = solve(i, j, grid);
            }
        }
        return ans;
    }
}