import java.util.StringTokenizer;
class Solution {
    public String sortSentence(String s) 
    {
        String[] str = new String[10];
        for(int i = 1; i<10; i++)
            str[i] = "";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            String temp = st.nextToken();
            int j = (int)(temp.charAt(temp.length()-1) - '0');
            str[j] = temp.substring(0, temp.length()-1);
        }
        StringBuilder ans = new StringBuilder("");
        for(int i = 1; i<10; i++)
            if(!str[i].equals(""))
                ans.append(str[i] + " ");
        String a = ans.toString();
        return a.substring(0, a.length()-1);
    }
}