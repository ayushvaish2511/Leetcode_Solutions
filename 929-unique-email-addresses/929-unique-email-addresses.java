class Solution {
    public int numUniqueEmails(String[] emails) 
    {
        HashSet<String> set = new HashSet<>();
        for(String w : emails)
        {
            StringBuilder sb = new StringBuilder("");
            boolean flag = false;
            for(int i = 0; i<w.length(); i++)
            {
                char ch = w.charAt(i);
                if(ch == '@')
                {
                    sb.append(w.substring(i));
                    break;
                }
                else if(!flag)
                {
                    if(ch == '+')
                    {
                        flag = true;
                    }                        
                    else if(ch == '.')
                    {
                        continue;
                    }
                    else 
                    {
                        sb.append(ch);
                    }
                }
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}