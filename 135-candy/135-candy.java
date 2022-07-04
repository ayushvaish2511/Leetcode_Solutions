class Solution {
    public int candy(int[] ratings) 
    {
        int n = ratings.length;
        int ans = 0;
        if(n == 1)
            return 1;
        int[] max = new int[n];
        max[0] = 1;
        for(int i = 1; i<n; i++)
        {
            max[i] = ratings[i] > ratings[i-1] ? (max[i-1] + 1) : 1;
        }
        int[] min = new int[n];
        min[n-1] = 1;
        for(int i = n-2; i>=0; i--)
        {
            min[i] = ratings[i] > ratings[i+1] ? (min[i+1] + 1) : 1;
        }
        for(int i = 0; i<n; i++)
        {
            ans += Math.max(max[i], min[i]);
        }
        return ans;
    }
}