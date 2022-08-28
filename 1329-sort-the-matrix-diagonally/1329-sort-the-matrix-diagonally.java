class Solution {
    public int[][] diagonalSort(int[][] mat) 
    {
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0; i<n; i++)
        {
            int row = 0;
            int col = i;
            ArrayList<Integer> ele = new ArrayList<>();
            while(row<m && col<n)
            {
                ele.add(mat[row][col]);
                row++;
                col++;
            }
            Collections.sort(ele);
            row = 0;
            col = i;
            int k = 0;
            while(row<m && col<n)
            {
                mat[row][col] = ele.get(k);
                row++;
                col++;
                k++;
            }
        }
        for(int i = 1; i<m; i++)
        {
            int row = i;
            int col = 0;
            ArrayList<Integer> ele = new ArrayList<>();
            while(row<m && col<n)
            {
                ele.add(mat[row][col]);
                row++;
                col++;
            }
            Collections.sort(ele);
            row = i;
            col = 0;
            int k = 0;
            while(row<m && col<n)
            {
                mat[row][col] = ele.get(k);
                row++;
                col++;
                k++;
            }
        }
        return mat;
    }
}