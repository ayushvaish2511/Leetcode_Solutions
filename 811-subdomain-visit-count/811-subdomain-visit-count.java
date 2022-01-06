class Solution {
    public List<String> subdomainVisits(String[] cpdomains) 
    {
        HashMap<String, Integer> count = new HashMap<>();
        for(String str: cpdomains)
        {
            int ind = str.indexOf(' ');
            int rep = Integer.parseInt(str.substring(0, ind));
            String s = str.substring(ind+1);
            for(int i = 0; i<s.length(); i++)
            {
                if(s.charAt(i) == '.')
                {
                    String check = s.substring(i+1);
                    if(count.containsKey(check))
                    {
                        count.put(check, count.get(check)+rep);
                    }
                    else
                    {
                        count.put(check, rep);
                    }
                }
            }
            if(count.containsKey(s))
            {
                count.put(s, count.get(s)+rep);
            }
            else 
            {
                count.put(s, rep);
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        for(String d : count.keySet())
            ans.add(count.get(d) + " " + d);
        return ans;
    }
}