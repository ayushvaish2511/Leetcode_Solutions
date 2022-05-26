public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) 
    {
        String a = Integer.toBinaryString(n);
        int ans = 0;
        for(int i = 0; i<a.length(); i++)
        {
            ans += a.charAt(i) == '1' ? 1 : 0;
        }
        return ans;
    }
}