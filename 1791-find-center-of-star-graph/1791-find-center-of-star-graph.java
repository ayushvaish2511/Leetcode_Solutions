class Solution {
    public int findCenter(int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        HashSet<Integer> nodes = new HashSet<>();
        for(int i = 0; i<edges.length; i++)
        {
            nodes.add(edges[i][0]);
            nodes.add(edges[i][1]);
        }
        int n = nodes.size();
        for(int i = 0; i<=n; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<edges.length; i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        for(int i = 1; i<=n; i++)
        {
            if(adj.get(i).size() > 1)
                return i;
        }
        return -1;
    }
}