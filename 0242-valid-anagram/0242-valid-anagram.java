class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] c = new int[26];
        for(int i = 0; i<s.length(); i++)
        {
            int ch = (int)(s.charAt(i) - 'a');
            c[ch]++;
            int ch1 = (int)(t.charAt(i) - 'a');
            c[ch1]--;            
        }
        for(int i = 0; i<26; i++)
        {
            if(c[i] != 0)
                return false;
        }
        return true;
    }
}