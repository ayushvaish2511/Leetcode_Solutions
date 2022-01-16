class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        int ans[][] = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        if (r * c != m * n) return mat;
        int a = 0, b = 0;
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                ans[a][b] = mat[i][j];
                b++;
                if(b>=c)
                {
                    b = 0;
                    a++;
                }
            }
        }
        return ans;
    }
}