class Solution {
    public boolean judgeCircle(String moves) 
    {
        int i = 0, j = 0;
        for(int k = 0; k<moves.length(); k++)
        {
            char ch = moves.charAt(k);
            if(ch == 'U')
                i++;
            else if(ch == 'D')
                i--;
            else if(ch == 'R')
                j++;
            else if(ch == 'L')
                j--;
        }
        return (i==0 && j==0);
    }
}