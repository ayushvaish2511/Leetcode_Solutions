class Solution {
    public boolean check(String a)
    {
        int i = 0;
        int j = a.length()-1;
        while(i<j)
        {
            if(a.charAt(i) != a.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String s : words)
        {
            if(check(s))
                return s;
        }
        return "";
    }
}