class Solution 
{
    public boolean check(int[] a, int[] b)
    {
        for(int i = 0; i<26; i++)
        {
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if(m>n)
            return false;
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for(int i = 0; i<m; i++)
        {
            char ch = s1.charAt(i);
            c1[ch-'a']++;
        }
        for(int i = 0; i<m; i++)
        {
            char ch = s2.charAt(i);
            c2[ch-'a']++;
        }
        if(check(c1, c2))
            return true;
        int j = 0;
        for(int i = m; i<n; i++, j++)
        {
            char ch = s2.charAt(i);
            c2[s2.charAt(i)-'a']++;
            c2[s2.charAt(j)-'a']--;
            if(check(c1, c2))
                return true;
        }
        return false;
    }
}