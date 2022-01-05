class Solution {
    public int balancedStringSplit(String s) 
    {
        int i = 0;
        int c = 0;
        int balance = 0;
        while(i<s.length())
        {
            if(s.charAt(i) == 'R')
                balance--;
            else
                balance++;
            if(balance == 0)
                c++;
            i++;
        }
        return c;
    }
}