class Solution {
    public int maxDepth(String s) 
    {
        int max = 0;
        int c = 0;
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            max = Math.max(max, c);
            if(ch == '(')
                c++;
            else if(ch == ')')
                c--;
        }
        return max;
    }
}