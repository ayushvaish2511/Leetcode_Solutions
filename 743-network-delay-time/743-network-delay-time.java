class Solution 
{
    //Building Adjacency Matrix
    public int[][] buildGraph(int[][] times, int n)
    {
        int[][] graph = new int[n+1][n+1];
        for(int i = 0; i<=n; i++)
        {
            for(int j = 0; j<=n; j++)
            {
                graph[i][j] = -1;
            }
        }
        for(int[] time : times)
        {
            graph[time[0]][time[1]] = time[2];
        }
        return graph;
    }
    public int networkDelayTime(int[][] times, int n, int k) 
    {
        int[][] graph = buildGraph(times, n);
        int[] visitedTime = new int[n+1];
        Arrays.fill(visitedTime, Integer.MAX_VALUE);
        
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(k);
        visitedTime[k] = 0;
        int maxTime = 0;
        while(!qu.isEmpty())
        {
            int size = qu.size();
            for(int index = 0; index < qu.size(); index++)
            {
                int vertex = qu.poll();
                for(int adjacent = 1; adjacent<=n; adjacent++)
                {
                    if(graph[vertex][adjacent] == -1)
                        continue;
                    if(visitedTime[vertex] + graph[vertex][adjacent] < visitedTime[adjacent])
                    {
                        visitedTime[adjacent] = visitedTime[vertex] + graph[vertex][adjacent];
                        qu.offer(adjacent);
                    }
                }
            }
        }
        for(int vertex = 1; vertex<=n; vertex++)
        {
            if(visitedTime[vertex] == Integer.MAX_VALUE)
            {
                return -1;
            }
            maxTime = Math.max(maxTime, visitedTime[vertex]);
        }
        return maxTime;
    }
}