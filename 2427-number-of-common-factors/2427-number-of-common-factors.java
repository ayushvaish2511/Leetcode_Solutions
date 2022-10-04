class Solution {
    public int commonFactors(int a, int b) 
    {
        int ans = 0;
        for(int i = 1; i<=a/2 && i<=b/2; i++)
        {
            if(a%i == 0 && b%i==0)
                ans++;
        }
        if(a%b == 0 && a>=b)
            ans++;
        if(b%a == 0 && b>a)
            ans++;
        return ans;
    }
}