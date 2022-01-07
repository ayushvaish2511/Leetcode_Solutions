class Solution {
    public int[] kWeakestRows(int[][] mat, int k) 
    {
        int[] scores = new int[mat.length];
        for(int i = 0; i<mat.length; i++)
        {
            int c = 0;
            for(int j = 0; j<mat[0].length; j++)
            {
                if(mat[i][j] == 1)
                    c++;
            }
            scores[i] = c * mat.length + i;
        }
        int[] ans = new int[k];
        int a = 0;
        Arrays.sort(scores);
        for(int i = 0; i<k; i++)
        {
            ans[a++] = scores[i]%mat.length;
        }
        return ans;
    }
}