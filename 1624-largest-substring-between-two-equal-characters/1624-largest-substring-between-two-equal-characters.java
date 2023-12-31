class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                int diff = i - map.get(ch) - 1;
                ans = ans > diff ? ans : diff;
            }
            else 
            {
                map.put(ch, i);
            }
        }
        return ans;
    }
}