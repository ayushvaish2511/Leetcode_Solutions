class Solution {
    public int[][] generateMatrix(int n) 
    {
        int[][] ans = new int[n][n];
        int k = 1;
        int sr = 0, sc = 0, lr = n-1, lc = n-1;
        while(sr<=lr && sc<=lc)
        {
            for(int i = sc; i<=lc; i++)
            {
                ans[sr][i] = k++;
            }
            for(int i = sr+1; i<=lr; i++)
            {
                ans[i][lc] = k++;
            }
            if(sc < lc)
            {
                for(int i = lc-1; i>=sc; i--)
                {
                    ans[lr][i] = k++;
                }
            }
            if(sr < lr)
            {
                for(int i = lr-1; i>sr; i--)
                {
                    ans[i][sc] = k++;
                }
            }
            sc++;
            sr++;
            lr--;
            lc--;
        }
        return ans;
    }
}