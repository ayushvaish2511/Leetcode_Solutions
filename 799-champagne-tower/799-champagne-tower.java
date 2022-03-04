class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] stack = new double[query_row+1][query_row+1];
        stack[0][0] = poured;
        for(int i = 0; i<query_row; i++)
        {
            for(int j = 0; j<query_row; j++)
            {
                if(stack[i][j] > 1)
                {
                    stack[i+1][j] += (stack[i][j] - 1)/2.0;
                    stack[i+1][j+1] += (stack[i][j] - 1)/2.0;
                }
            }
        }
        return Math.min(1.0, stack[query_row][query_glass]);
    }
}