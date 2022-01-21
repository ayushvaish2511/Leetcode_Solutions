class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) 
    {
        int[] ans = new int[s.length()];
        for(int i = 0; i<s.length(); i++)
        {
            int sr = startPos[0];
            int sc = startPos[1];
            int c = 0;
            for(int j = i; j<s.length(); j++)
            {
                char ch = s.charAt(j);
                if(ch=='U')
                    sr--;
                else if(ch == 'R')
                    sc++;
                else if(ch == 'D')
                    sr++;
                else if(ch == 'L')
                    sc--;
                if(sr<0 || sc<0 || sr>=n || sc>=n)
                    break;
                c++;
            }
            ans[i] = c;
        }
        return ans;
    }
}