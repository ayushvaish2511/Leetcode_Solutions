class Solution {
    public int countNegatives(int[][] grid) 
    {
        int c = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = m-1; i>=0; i--)
        {
            if(grid[i][n-1]<0)
            {
                for(int j = n-1; j>=0; j--)
                {
                    if(grid[i][j]<0)
                        c++;
                    else
                        break;
                }
            }
            else 
                break;
        }
        return c;
    }
}