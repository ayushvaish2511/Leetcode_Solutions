class Solution {
    public boolean detectCapitalUse(String word) 
    {
        int c = 0;
        for(int i = 0; i<word.length(); i++)
        {
            char ch = word.charAt(i);
            if(ch >= 65 && ch <= 90)
                c++;
        }
        if(c == word.length() || c==0)
            return true;
        if(c == 1 && word.charAt(0)<=90)
            return true;
        return false;
    }
}