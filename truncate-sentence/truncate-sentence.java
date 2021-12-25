class Solution {
    public String truncateSentence(String s, int k) {
        int i = 0;
        for(i = 0; i<s.length(); i++)
        {
            if(k==0)
                break;
            if(s.charAt(i)==' ')
                k--;
        }
        if(i==s.length())
            return s.substring(0, i);
        else 
            return s.substring(0, i-1);
    }
}