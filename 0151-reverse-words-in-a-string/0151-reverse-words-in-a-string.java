import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder ans = new StringBuilder("");
        while(st.hasMoreTokens())
        {
            String temp = st.nextToken();
            if(ans.length() == 0)
                ans.append(temp);
            else 
                ans.insert(0, temp + " ");
        }
        return ans.toString();
    }
}