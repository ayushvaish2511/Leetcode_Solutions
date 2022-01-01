class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) 
    {
        int[][] ans = new int[rowSum.length][colSum.length];
        for(int i = 0; i<rowSum.length; i++)
        {
            for(int j = 0; j<colSum.length; j++)
            {
                int val = rowSum[i] < colSum[j] ? rowSum[i] : colSum[j];
                ans[i][j] = val;
                rowSum[i] = rowSum[i]-val;
                colSum[j] = colSum[j]-val;
            }
        }
        return ans;
    }
}