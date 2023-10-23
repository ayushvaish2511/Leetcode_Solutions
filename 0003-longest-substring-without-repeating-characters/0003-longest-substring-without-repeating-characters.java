class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int strt = 0;
        int i = 0;
        for(i = 0; i<s.length(); i++)
        {
            ans = Math.max((i-strt), ans);
            char ch = s.charAt(i);
            if(map.containsKey(ch) && map.get(ch) >= strt)
            {
                strt = map.get(ch) + 1;
            }
            map.put(ch, i);
        }
        if(ans < i-strt)
        {
            return i-strt;
        }
        return ans;
    }
}