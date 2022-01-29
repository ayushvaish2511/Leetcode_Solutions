class Solution {
    public int minSteps(String s, String t) 
    {
        int[] sc = new int[26];
        int[] tc = new int[26];
        for(int i = 0; i<s.length(); i++)
            sc[s.charAt(i)-'a']++;
        for(int i = 0; i<t.length(); i++)
            tc[t.charAt(i)-'a']++;
        int ans = 0;
        for(int i = 0; i<26; i++)
        {
            if(sc[i] > tc[i])
                ans = ans + (sc[i] - tc[i]);
        }
        return ans;
    }
}