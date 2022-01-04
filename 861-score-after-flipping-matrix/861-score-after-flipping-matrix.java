class Solution {
    int[][] flipRow(int[][] grid, int i)
    {
        for(int j = 0; j<grid[0].length; j++)
        {
            if(grid[i][j] == 0)
                grid[i][j] = 1;
            else 
                grid[i][j] = 0;
        }
        return grid;
    }
    
    int[][] flipCol(int[][] grid, int j)
    {
        for(int i = 0; i<grid.length; i++)
        {
            if(grid[i][j] == 0)
                grid[i][j] = 1;
            else 
                grid[i][j] = 0;
        }
        return grid;
    }
    public int matrixScore(int[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        int[] c = new int[n];
        for(int i = 0; i<m; i++)
        {
            if(grid[i][0] == 0)
                grid = flipRow(grid, i);
            for(int j = 0; j<n; j++)
            {
                if(grid[i][j] == 1)
                    c[j]++;
            }
        }
        for(int j = 0; j<n; j++)
        {
            if(c[j] <= m/2)
                grid = flipCol(grid, j);
        }
        int soln = 0;
        for(int i = 0; i<m; i++)
        {
            int po = 0;
            for(int j = n-1; j>=0; j--)
            {
                soln = soln + ((int)Math.pow(2, po++) * grid[i][j]);
            }
        }
        return soln;
    }
}