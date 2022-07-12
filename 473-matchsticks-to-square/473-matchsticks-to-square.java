class Solution {
    public boolean makesquare(int[] matchsticks) 
    {
        int sum = 0;
        int n = matchsticks.length;
        for(int i = 0; i<n; i++)
        {
            sum += matchsticks[i];
        }
        if(sum%4 != 0 || n == 0)
        {
            return false;
        }
        Arrays.sort(matchsticks);
        return dfs(matchsticks, new int[4], n-1, sum/4);
    }
    public boolean dfs(int[] m, int[] side, int index, int target)
    {
        if(index == -1)
            return true;
        for(int i = 0; i<4; i++)
        {
            if((side[i] + m[index] > target) || (i > 0 && side[i] == side[i-1]))
                continue;
            side[i] += m[index];
            if(dfs(m, side, index-1, target))
                return true;
            side[i] -= m[index];
        }
        return false;
    }
}