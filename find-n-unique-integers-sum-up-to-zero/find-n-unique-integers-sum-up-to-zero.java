class Solution {
    public int[] sumZero(int n) 
    {
        int[] ans = new int[n];
        int c = 1;
        for(int i = 0; i<n; i+=2, c++)
        {
            if(i==n-1)
                ans[i] = 0;
            else
            {
                ans[i] = c;
                ans[i+1] = 0-c;
            }
        }
        return ans;
    }
}