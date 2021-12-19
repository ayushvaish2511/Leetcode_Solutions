class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        for(int i = 0; i<n; i++)
        {
            int c = 0;
            for(int j = 0; j<n; j++)
            {
                if(boxes.charAt(j)=='1')
                {
                    c = c + Math.abs(i-j);
                }
            }
            ans[i] = c;
        }
        return ans;
    }
}