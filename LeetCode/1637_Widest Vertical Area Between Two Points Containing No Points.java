import java.util.Arrays;
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] y = new int[n];
        for(int i = 0; i<n; i++)
        {
            y[i] = points[i][0];
        }
        Arrays.sort(y);
        int ans = 0;
        for(int i = 0; i<n-1; i++)
        {
            if((y[i+1]-y[i]) > ans)
                ans = y[i+1]-y[i];
        }
        return ans;
    }
}