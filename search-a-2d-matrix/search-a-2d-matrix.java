class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i<m; i++)
        {
            if(target>=matrix[i][0] && target<=matrix[i][n-1])
            {
                int l = 0, u = n-1;
                while(l<=u)
                {
                    int mid = (l+u)/2;
                    if(matrix[i][mid] == target)
                        return true;
                    if(target > matrix[i][mid])
                        l = mid+1;
                    else 
                        u = mid-1;                    
                }
                break;
            }
        }
        return false;
    }
}