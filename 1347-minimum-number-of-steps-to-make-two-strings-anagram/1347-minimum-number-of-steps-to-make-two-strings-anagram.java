class Solution {
    public int minSteps(String s, String t) {
        int[] sc = new int[26];
        int[] tc = new int[26];
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            sc[(int)(ch-'a')]++;
        }
        for(int i = 0; i<t.length(); i++)
        {
            char ch = t.charAt(i);
            tc[(int)(ch-'a')]++;
        }
        int ans = 0;
        for(int i = 0; i<26; i++)
        {
            if(sc[i] > tc[i])
            {
                ans += (sc[i] - tc[i]);
            }
        }
        return ans;
    }
}