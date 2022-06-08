class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) 
    {
        int q = queries.length;
        boolean[] ans = new boolean[q];
        long[] candy = new long[candiesCount.length];
        candy[0] = candiesCount[0];
        for(int i = 1; i<candiesCount.length; i++)
        {
            candy[i] = candiesCount[i] + candy[i-1];
        }
        int k = 0;
        for(int[] qu : queries)
        {
            long upper = candy[qu[0]];
            long lower = 0;
            if(qu[0] != 0)
            {
                lower = (long)Math.round((candy[qu[0]-1] / (qu[2] * 1.0)));
            }
            if(qu[1] < upper && qu[1] >= lower)
            {
                ans[k++] = true;
            }
            else
            {
                ans[k++] = false;
            }
        }
        return ans;
    }
}