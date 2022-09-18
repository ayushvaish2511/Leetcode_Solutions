class Solution {
    public String convert(int n, int k)
    {
        StringBuilder st = new StringBuilder("");
        while(n!=0)
        {
            int rem = n%k;
            st.append(rem+"");
            n /= k;
        }
        return st.toString();
    }
    public boolean check(String s)
    {
        int strt = 0;
        int end = s.length()-1;
        while(strt<end)
        {
            if(s.charAt(strt) != s.charAt(end))
                return false;
            strt++;
            end--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) 
    {
        for(int i = 2; i<=(n-2); i++)
        {
            String co = convert(n, i);
            if(!check(co))
                return false;
        }
        return true;
    }
}