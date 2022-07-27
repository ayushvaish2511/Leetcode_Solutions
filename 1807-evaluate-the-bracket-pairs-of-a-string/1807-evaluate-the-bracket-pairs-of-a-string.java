class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i<knowledge.size(); i++)
        {
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        StringBuilder ans = new StringBuilder("");
        StringBuilder w = new StringBuilder("");
        int c = 0;
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
                c++;
            else if(c > 0 && ch!=')')
            {
                w.append(ch+"");
            }
            else if(ch == ')')
            {
                c--;
                String key = w.toString();
                if(map.containsKey(key))
                    ans.append(map.get(key));
                else
                    ans.append("?");
                w.setLength(0);
            }
            else
                ans.append(ch+"");
        }
        return ans.toString();
    }
}