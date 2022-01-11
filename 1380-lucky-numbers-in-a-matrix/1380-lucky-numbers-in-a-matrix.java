class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] maxCol = new int[n];
        int[] minRow = new int[m];
        
        //To find min of every Row
        for(int i = 0; i<m; i++)
        {
            int min = matrix[i][0];
            for(int j = 1; j<n; j++)
            {
                if(matrix[i][j] < min)
                    min = matrix[i][j];
            }
            minRow[i] = min;
        }
        
        //To find max of each coloumn
        for(int j = 0; j<n; j++)
        {
            int max = matrix[0][j];
            for(int i = 1; i<m; i++)
            {
                if(matrix[i][j] > max)
                    max = matrix[i][j];
            }
            maxCol[j] = max;
        }
        
        //Now final list to be returnes
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j])
                    ans.add(matrix[i][j]);
            }
        }
        return ans;
    }
}