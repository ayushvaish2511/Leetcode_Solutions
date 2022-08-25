class Solution 
{
    public int findCircleNum(int[][] isConnected) 
    {
        ArrayList<HashSet<Integer>> adj = new ArrayList<>();
        int n = isConnected.length;
        for(int i = 0; i<n; i++)
        {
            adj.add(new HashSet<Integer>());
        }
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(isConnected[i][j] == 1)
                    adj.get(i).add(j);
            }
        }
        boolean[] vis = new boolean[n];
        int ans = 0;
        for(int i = 0; i<n; i++)
        {
            if(!vis[i])
            {
                ans++;
                Queue<Integer> qu = new LinkedList<>();
                vis[i] = true;
                qu.add(i);
                while(!qu.isEmpty())
                {
                    Integer curr = qu.poll();
                    for(Integer it : adj.get(curr))
                    {
                        if(!vis[it])
                        {
                            vis[it] = true;
                            qu.add(it);
                        }
                    }
                }
            }
        }
        return ans;
    }
}