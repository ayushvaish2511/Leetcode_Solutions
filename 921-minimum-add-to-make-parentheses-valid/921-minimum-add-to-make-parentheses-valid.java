class Solution {
    public int minAddToMakeValid(String s) {
        int c = 0;
        int ans = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == '(')
                c++;
            else 
                c--;
            if(c < 0)
            {
                ans += Math.abs(c);
                c = 0;
            }
            
        }
        return ans + c;
    }
}