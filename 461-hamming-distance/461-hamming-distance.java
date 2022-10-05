class Solution {
    public int hammingDistance(int x, int y) 
    {
        StringBuilder m = new StringBuilder("");
        while(x>0)
        {
            m.append(x%2 + "");
            x /= 2;
        }
        StringBuilder n = new StringBuilder("");
        while(y>0)
        {
            n.append(y%2 + "");
            y /= 2;
        }
        String a = m.toString();
        String b = n.toString();
        int ans = 0;
        int i = 0;
        for(i = 0; i<a.length() && i<b.length(); i++)
        {
            if(a.charAt(i) != b.charAt(i))
                ans++;
        }
        while(i<a.length())
        {
            if(a.charAt(i) == '1')
                ans++;
            i++;
        }
        while(i<b.length())
        {
            if(b.charAt(i) == '1')
                ans++;
            i++;
        }
        return ans;
    }
}