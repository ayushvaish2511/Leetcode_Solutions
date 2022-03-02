class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        int i = 0, j = 0;
        while(i<s.length() && j<t.length())
        {
            char ch = s.charAt(i);
            char chr = t.charAt(j);
            if(ch == chr)
            {
                i++;
                j++;
            }
            else 
            {
                j++;
            }
        }
        if(i == s.length())
            return true;
        return false;
    }
}