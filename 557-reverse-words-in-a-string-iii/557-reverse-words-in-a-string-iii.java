import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) 
    {
        StringTokenizer st = new StringTokenizer(s);  
        StringBuilder ans = new StringBuilder("");
        while(st.hasMoreTokens())
        {
            char[] a = (st.nextToken()).toCharArray();
            int i = 0, j = a.length-1;
            while(i<j)
            {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            ans.append(String.valueOf(a));
            if(st.hasMoreTokens())
            {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}