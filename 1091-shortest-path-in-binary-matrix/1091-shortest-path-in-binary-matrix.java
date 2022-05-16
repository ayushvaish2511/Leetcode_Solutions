class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) 
    {
        if(grid[0][0] != 0)
            return -1;
        int n = grid.length;
        Queue<int[]> qu = new LinkedList<>();
        qu.offer(new int[]{0, 0, 1});
        int[][] dir = {{1,1}, {-1,-1},{1,0},{-1,0},{0,1},{0,-1},{1,-1},{-1,1}};
        while(!qu.isEmpty())
        {
            int l = qu.size();
            while(l-- >0)
            {
                int f[] = qu.poll();
                if(f[0] == n-1 && f[1] == n-1)
                {
                    return f[2];
                }
                for(int k[] : dir)
                {
                    int i = f[0] + k[0];
                    int j = f[1] + k[1];
                    if(i>=0 && j>=0 && i<n && j<n && grid[i][j] == 0)
                    {
                        qu.offer(new int[]{i, j, f[2]+1});
                        grid[i][j] = 1;
                    }
                }
            }
        }
        return -1;
    }
}