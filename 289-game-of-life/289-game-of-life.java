class Solution {
    public int count(int[][] board, int a, int b) 
    {
        int c = 0;
        int m = board.length;
        int n = board[0].length;
        int[] x = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] y = {-1, 0, 1, -1, 1, -1, 0, 1};
        for(int i = 0; i<8; i++)
        {
            int xcord = a + x[i];
            int ycord = b + y[i];
            if(xcord >= 0 && xcord < m && ycord >= 0 && ycord < n && board[xcord][ycord] == 1)
                c++;                
        }
        return c;
    }
    public void gameOfLife(int[][] board) 
    {
        int m = board.length;
        int n = board[0].length;
        int[][] c = new int[m][n];
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                c[i][j] = count(board, i, j);
            }
        }
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(board[i][j] == 1)
                {
                    if(c[i][j] < 2)
                        board[i][j] = 0;
                    else if(c[i][j] <=3)
                        board[i][j] = 1;
                    else
                        board[i][j] = 0;
                }
                else
                {
                    if(c[i][j] == 3)
                        board[i][j] = 1;
                }
            }
        }
    }
}