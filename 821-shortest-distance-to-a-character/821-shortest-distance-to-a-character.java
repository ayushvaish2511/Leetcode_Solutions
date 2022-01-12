class Solution {
    public int[] shortestToChar(String s, char c) {
        int ind = s.indexOf(c);
        int[] ans = new int[s.length()];
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == c)
                ind = i;
            int nex = s.indexOf(c, i);
            
            ans[i] = Math.min(Math.abs(i-nex), Math.abs(i-ind));
        }
        return ans;
    }
}