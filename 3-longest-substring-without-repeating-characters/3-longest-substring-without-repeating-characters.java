class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap<String, Integer> st = new HashMap<>();
        int max = 0;
        int strt = 0, end = 0;
        int i;
        for(i = 0; i<s.length(); i++)
        {
            max = Math.max((i - strt), max) ;
            char ch = s.charAt(i);
            if(st.containsKey(ch+"") && st.get(ch+"") >= strt)
            {
                strt = st.get(ch+"") + 1;
            }
            st.put(ch+"", i);
        }
        if(max < i-strt) 
            return i-strt;
        return max;
    }
}