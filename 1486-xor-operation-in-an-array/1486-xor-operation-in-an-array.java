class Solution {
    public int xorOperation(int n, int start) 
    {
        int ans = 0;
        for(int i = 0; i<n; i++, start+=2)
        {
            ans = ans^start;
        }
        return ans;
    }
}