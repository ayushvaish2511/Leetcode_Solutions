class Solution {
    public boolean valid(String s, int i, int j)
    {
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) 
    {
        int i = 0;
        int j = s.length()-1;
        while(i<=j)
        {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(a != b)
            {
                if(valid(s, i+1, j))
                    return true;
                if(valid(s, i, j-1))
                    return true;
                return false;
            }
            i++;
            j--;
        }
        return true;
       
    }
}