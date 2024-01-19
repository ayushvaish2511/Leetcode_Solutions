class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 1; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                int left = j == 0 ? Integer.MAX_VALUE : matrix[i-1][j-1];
                int up = matrix[i-1][j];
                int right = j == n-1 ? Integer.MAX_VALUE : matrix[i-1][j+1];
                int min = Math.min(left, Math.min(up, right));
                matrix[i][j] += min;
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            ans = ans < matrix[m-1][i] ? ans : matrix[m-1][i];
        }
        return ans;
    }
}