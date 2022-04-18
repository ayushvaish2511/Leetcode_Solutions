class Solution {
    public int numSpecial(int[][] mat) 
    {
        int m = mat.length;
        int n = mat[0].length;
        int[] cr = new int[m];
        int[] cc = new int[n];
        for(int i = 0; i<m; i++)
        {
            int c = 0;
            for(int j = 0; j<n; j++)
            {
                if(mat[i][j] == 1)
                    c++;
            }
            cr[i] = c;
        }
        for(int i = 0; i<n; i++)
        {
            int c = 0;
            for(int j = 0; j<m; j++)
            {
                if(mat[j][i] == 1)
                    c++;
            }
            cc[i] = c;
        }
        int ans = 0;
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(mat[i][j] == 1 && cr[i] == 1 && cc[j] == 1)
                    ans++;
            }
        }
        return ans;
    }
}