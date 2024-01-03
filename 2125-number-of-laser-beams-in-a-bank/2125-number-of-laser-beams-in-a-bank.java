class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int prev = 0;
        for(String s : bank)
        {
            int c = 0;
            for(int i = 0; i<s.length(); i++)
            {
                if(s.charAt(i) == '1')
                {
                    c++;
                }
            }
            ans += (prev*c);
            if(c > 0)
                prev = c;
        }
        return ans;
    }
}