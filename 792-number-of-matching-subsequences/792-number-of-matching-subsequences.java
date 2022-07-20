class Solution {
    public boolean check(String s, String a)
    {
        int prev = 0;
        for(char ch : a.toCharArray())
        {
            int index = s.indexOf(ch, prev);
            if(index == -1)
            {
                return false;
            }
            else 
            {
                prev = index+1;
            }
        }
        return true;
    }
    public int numMatchingSubseq(String s, String[] words) 
    {
        int ans = 0;
        for(String word: words)
        {
            if(check(s, word))
            {
                ans++;
            }
        }
        return ans;
    }
}