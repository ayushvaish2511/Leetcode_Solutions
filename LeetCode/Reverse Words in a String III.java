import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) 
    {
        StringBuilder ans = new StringBuilder("");
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            StringBuilder word = new StringBuilder(st.nextToken());
            ans.append((word.reverse() + " "));
        }
        return ans.toString().trim();
    }
}