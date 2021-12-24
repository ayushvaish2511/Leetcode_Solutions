class Solution {
    public int[] processQueries(int[] queries, int m) {
        ArrayList<Integer> p = new ArrayList<Integer>();
        for(int i = 1; i<=m; i++)
            p.add(i);
        int n = queries.length;
        int[] re = new int[n];
        for(int i = 0; i<n; i++)
        {
            re[i] = p.indexOf(queries[i]);
            p.remove(new Integer(queries[i]));
            p.add(0, queries[i]);
        }
        return re;
    }
}