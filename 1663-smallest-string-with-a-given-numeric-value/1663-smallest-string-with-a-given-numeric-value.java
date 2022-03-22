class Solution {
    public String getSmallestString(int n, int k) 
    {
        char[] ans = new char[n];
        for(int i = 0; i<n; i++)
        {
            ans[i] = 'a';
        }
        k = k-n;
        if(k>0)
        {
            for(int i = n-1; i>=0; i--)
            {
                k += 1;
                if(k-26>0)
                {
                    ans[i] = 'z';
                    k = k-26;
                }
                else
                {
                    ans[i] = (char)(k+97-1);
                    break;
                }
            }
        }
        StringBuilder ret = new StringBuilder("");
        ret.append(ans);
        return ret.toString();
        
    }
}