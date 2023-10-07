class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = -1;
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(matrix[mid][m-1] >= target)
            {
                row = mid;
                high = mid - 1;
            }
            else 
            {
                low = mid + 1;
            }
        }
        if(row == -1)
            return false;
        low = 0;
        high = m-1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(matrix[row][mid] == target)
            {
                return true;
            }
            else if(matrix[row][mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return false;
    }
}