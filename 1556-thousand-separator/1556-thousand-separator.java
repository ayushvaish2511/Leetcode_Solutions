class Solution {
    public String thousandSeparator(int n) 
    {
        String s = String.valueOf(n);
        int l = s.length();
        String ans = "";
        int c = 0;
        for(int i = l-1; i>=0; i--)
        {
            c++;
            ans = s.charAt(i) + ans;
            if(c==3 && i!=0)
            {
                ans = "." + ans;
                c = 0;
            }            
        }
        return ans;
    }
}