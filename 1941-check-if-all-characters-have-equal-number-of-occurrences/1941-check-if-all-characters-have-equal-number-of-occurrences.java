class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] c = new int[26];
        for(int i = 0; i<s.length(); i++)
        {
            c[s.charAt(i) - 'a']++;
        }
        int same = c[s.charAt(0)-'a'];
        for(int i = 0; i<26; i++)
        {
            if(c[i] != same && c[i] != 0)
                return false;
        }
        return true;
    }
}