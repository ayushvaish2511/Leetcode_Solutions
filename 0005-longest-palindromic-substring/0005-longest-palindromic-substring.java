class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n < 2)
            return s;
        int start = 0;
        int maxLen = 1;
        for(int i = 0; i<s.length(); i++)
        {
            int low = i-1;
            int high = i+1;
            while(low >= 0 && s.charAt(i) == s.charAt(low))
                low--;
            while(high < n && s.charAt(i) == s.charAt(high))
                high++;
            while(low >= 0 && high < n && s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;
            }
            int len = high - low - 1;
            if(len > maxLen)
            {
                start = low+1;
                maxLen = len;
            }
        }
        return s.substring(start, start + maxLen);
    }
}