class Solution {
    public String longestWord(String[] words) 
    {
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i<words.length; i++)
        {
            set.add(words[i]);
        }
        String ans = "";
        for(String w : words)
        {
            StringBuilder st = new StringBuilder("");
            boolean flag = false;
            for(int i = 0; i<w.length(); i++)
            {
                st.append(w.charAt(i));
                if(!set.contains(st.toString()))
                {
                    flag = true;
                }
            }
            if(!flag)
            {
                if(w.length() > ans.length())
                    ans = w;
                else if(w.length() == ans.length())
                {
                    if(w.compareTo(ans) < 0)
                        ans = w;                        
                }
            }
        }
        return ans;
    }
}