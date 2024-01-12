class Solution {
    public boolean halvesAreAlike(String s) {
        String vow = "aeiouAEIOU";
        int c1 = 0, c2 = 0;
        int n = s.length();
        for(int i = 0; i<n; i++)
        {
            char ch = s.charAt(i);
            if(vow.indexOf(ch) != -1)
            {
                if(i < n/2)
                {
                    c1++;
                }
                else 
                {
                    c2++;
                }
            }
        }
        return c1 == c2;
    }
}