class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for(int i = 0; i<s.length(); i++)
        {
            int[] c = new int[26];
            for(int j = i; j<s.length(); j++)
            {
                int ch = (int)(s.charAt(j) - 'a');
                c[ch]++;
                int max = 0, min = Integer.MAX_VALUE;
                for(int k : c)
                {
                    if(k == 0)
                        continue;
                    max = max > k ? max : k;
                    min = min < k ? min : k;
                }
                ans += (max - min);
            }
        }
        return ans;
    }
}