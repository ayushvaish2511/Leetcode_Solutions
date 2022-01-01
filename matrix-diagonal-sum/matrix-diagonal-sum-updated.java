/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Matrix Diagonal Sum.
Memory Usage: 44.7 MB, less than 20.52% of Java online submissions for Matrix Diagonal Sum.*/

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0, j = 0; i<n; i++, j++)
        {
            sum+=mat[i][j];
        }
        for(int i = 0, j = n-1; i<n; i++, j--)
        {
            sum+=mat[i][j];
        }
        if(n%2==1)
            sum = sum-mat[n/2][n/2];
        return sum;
    }
}
