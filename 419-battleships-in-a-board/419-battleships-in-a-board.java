class Solution {
    public int countBattleships(char[][] board) 
    {
        int c = 0;
        for(int i = 0; i<board.length; i++)
        {
            for(int j = 0; j<board[0].length; j++)
            {
                if(board[i][j] == 'X')
                {
                    if(i-1 >= 0)
                        if(board[i-1][j] == 'X')
                            continue;
                    if(j-1 >= 0)
                        if(board[i][j-1] == 'X')
                            continue;
                    c++;
                }
            }
        }
        return c;
    }
}