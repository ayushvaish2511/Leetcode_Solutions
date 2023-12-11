class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int ans = 0;
        int currDecrement = 0;
        for(int i : batteryPercentages)
        {
            int present = Math.max(0, i-currDecrement);
            if(present == 0)
                continue;
            else 
            {
                currDecrement++;
                ans++;
            }
        }
        return ans;
    }
}