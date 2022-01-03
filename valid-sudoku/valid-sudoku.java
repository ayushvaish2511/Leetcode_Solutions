class Solution {
    public boolean check(int a, int b, char[][] board)
    {
        Set<String> ss = new HashSet<String>();
        for(int i = a; i<a+3; i++)
        {
            for(int j = b; j<b+3; j++)
            {
                if(ss.contains(board[i][j]+"") && board[i][j]!='.')
                    return false;
                else if(board[i][j]!='.')
                    ss.add(board[i][j]+"");

            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) 
    {
        Solution ob = new Solution();
        for(int i = 0; i<9; i++)
        {
            Set<String> row = new HashSet<String>();
            for(int j = 0; j<9; j++)
            {
                if(row.contains(board[i][j]+"") && board[i][j]!='.')
                    return false;
                else if(board[i][j]!='.')
                    row.add(board[i][j]+"");
            }
            Set<String> column = new HashSet<String>();
            for(int j = 0; j<9; j++)
            {
                if(column.contains(board[j][i]+"") && board[j][i]!='.')
                    return false;
                else if(board[j][i]!='.')
                    column.add(board[j][i]+"");
            }
        }
        for(int i = 0; i<9; i+=3)
        {
            for(int j = 0; j<9; j+=3)
            {
                if(!ob.check(i, j, board))
                    return false;
            }
        }
        return true;
    }
}