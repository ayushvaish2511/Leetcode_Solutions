class Solution {
    public int arrangeCoins(int n) 
    {
        double req = (((Math.sqrt(4.0*n*2 + 1)) - 1)/2.0);
        if(((req * (req+1))/2.0) == n)
            return (int)req;
        else if(Math.floor(req) == req)
            return (int)(req-1);
        return (int)(Math.floor(req));
    }
}