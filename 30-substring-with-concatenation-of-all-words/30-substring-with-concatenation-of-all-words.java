class Solution {
    public List<Integer> findSubstring(String s, String[] words) 
    {
        int n = words.length;
        int l = words[0].length();
        int tot_len = n*l;
        List<Integer> ans = new ArrayList<>();
        if(tot_len > s.length())
            return ans;
        HashMap<String, Integer> map = new HashMap<>();
        for(String wrd : words)
        {
            if(map.containsKey(wrd))
                map.put(wrd, map.get(wrd)+1);
            else 
                map.put(wrd, 1);
        }
        for(int i = 0; i<=s.length()-tot_len; i++)
        {
            int j = i;
            int count = n;
            HashMap<String, Integer> temp_map = (HashMap<String, Integer>) map.clone();
            while(j < i+tot_len)
            {
                String word = s.substring(j, j+l);
                if(!map.containsKey(word) || temp_map.get(word) == 0)
                    break;
                else 
                {
                    temp_map.put(word, temp_map.get(word)-1);
                    count--;
                }
                j += l;
            }
            if (count == 0)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}