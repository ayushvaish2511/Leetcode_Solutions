class Solution {
    public int maxDepth(String s) {
        int c = 0;
        int max = 0;
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
                c++;
            else if(ch == ')')
                c--;
            max = max > c ? max : c;
        }
        return max;
    }
}