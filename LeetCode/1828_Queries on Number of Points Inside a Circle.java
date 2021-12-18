class Solution {
    public int[] countPoints(int[][] points, int[][] queries) 
    {
        int m = queries.length;
        int n = points.length;
        int[] ans = new int[m];
        for(int i = 0; i<m; i++)
        {
            int c = 0;
            for(int j = 0; j<n; j++)
            {
                if(distance(points[j][0],  points[j][1], queries[i][0], queries[i][1]) <= queries[i][2]*queries[i][2])
                    c++;
            }
            ans[i] = c;
        }
        return ans;
    }
    public int distance(int x1, int y1, int x2, int y2)
    {
        return ((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
}