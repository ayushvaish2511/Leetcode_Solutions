class Solution {
    public String sortString(String s) 
    {
        int[] c = new int[26];
        for(int i = 0; i<s.length(); i++)
        {
            c[s.charAt(i)-'a']++;
        }
        StringBuilder ans = new StringBuilder("");
        int k = 0;
        while(true)
        {
            if(ans.length() == s.length())
                break;
            for(int i = 0; i<26; i++)
            {
                if(c[i]>0)
                {
                    ans.append((char)('a' + i));
                    c[i]--;
                }
                if(c[i] == 0)
                    k++;
            }
            for(int i = 25; i>=0; i--)
            {
                if(c[i]>0)
                {
                    ans.append((char)('a' + i));
                    c[i]--;
                }
                if(c[i] == 0)
                    k++;
            }     
        }
        return ans.toString();
    }
}