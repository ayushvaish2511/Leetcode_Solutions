class Solution {
    public boolean compare(int[] a, int[] b)
    {
        for(int i = 0; i<a.length; i++)
        {
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }
    
    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> ans = new ArrayList<>();
        int[] countS = new int[26];
        int[] countP = new int[26];
        int m = s.length();
        int n = p.length();
        if(m<n)
            return ans;
        for(int i = 0; i<n; i++)
        {
            countS[s.charAt(i) - 'a']++;
            countP[p.charAt(i) - 'a']++;
        }
        int i = n;
        for(i = n; i<m; i++)
        {
            if(compare(countS, countP))
            {
                ans.add(i-n);
            }
            countS[s.charAt(i) - 'a']++;
            countS[s.charAt(i-n) - 'a']--;
        }
        if(compare(countS, countP))
            ans.add(i-n);
        return ans;
    }
}