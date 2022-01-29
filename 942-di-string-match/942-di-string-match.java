class Solution {
    public int[] diStringMatch(String s) 
    {
        int[] ans = new int[s.length() + 1];
        int ic = 0;
        int dc = s.length();
        int i = 0;
        for(i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == 'I')
                ans[i] = ic++;
            else 
                ans[i] = dc--;
        }
        ans[i] = ic;
        return ans;
    }
}