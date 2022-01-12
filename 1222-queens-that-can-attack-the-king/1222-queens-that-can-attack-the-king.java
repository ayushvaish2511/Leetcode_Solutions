class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[][] board = new boolean[8][8];
        for(int[] i : queens)
        {
            board[i[0]][i[1]] = true;
        }
        int[][] moves = {{-1,-1}, {-1,0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
        for(int i = 0; i<8; i++)
        {
            int k = king[0] + moves[i][0];
            int l = king[1] + moves[i][1];
            while(k>=0 && l>=0 && k<8 &&l<8)
            {
                if(board[k][l])
                {
                    ArrayList<Integer> sample = new ArrayList<>();
                    sample.add(k);
                    sample.add(l);
                    ans.add(sample);
                    break;
                }
                k = k + moves[i][0];
                l = l + moves[i][1];
            }
        }
        return ans;
    }
}