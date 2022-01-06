class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int curr = 0;
        int cummulative = 0;
        int ans = 0;
        for(int i = satisfaction.length-1; i>=0; i--)
        {
            curr = curr + cummulative + satisfaction[i];
            cummulative = cummulative + satisfaction[i];
            ans = Math.max(curr, ans);
        }
        return ans;
    }
}