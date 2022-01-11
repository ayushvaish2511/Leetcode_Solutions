class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        for(int i = 1; i<arr.length; i++)
        {
            arr[i] = arr[i]^arr[i-1];
        }
        int[] ans = new int[queries.length];
        for(int i = 0; i<queries.length; i++)
        {
            int s = arr[queries[i][1]];
            if(queries[i][0] != 0)
                s = s^arr[queries[i][0]-1];
            ans[i] = s;
        }
        return ans;
    }
}