class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int ans = 0;
        for(int i : nums)
        {
            if(i % 2 == 0) ans++;
        }
        return ans >= 2;
    }
}