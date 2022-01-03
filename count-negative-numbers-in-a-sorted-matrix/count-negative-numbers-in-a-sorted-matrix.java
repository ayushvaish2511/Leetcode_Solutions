class Solution {
    public int countNegatives(int[][] grid) 
    {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        // for(int i = m-1; i>=0; i--)
        // {
        //     if(grid[i][n-1]<0)
        //     {
        //         for(int j = n-1; j>=0; j--)
        //         {
        //             if(grid[i][j]<0)
        //                 count++;
        //             else
        //                 break;
        //         }
        //     }
        //     else 
        //         break;
        // }
        int i = m-1;            //Starting from bottom-left corner
        int j = 0;
        while(i>=0 && j<n)
        {
            if(grid[i][j] < 0)
            {
                i--;
                count = count + n - j;
            }
            else 
            {
                j++;
            }
        }
        return count;
    }
}