class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, Integer> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        int c = 0;
        for(String s : strs)
        {
            HashMap<Character, Integer> uniq = new HashMap<>();
            for(int i = 0; i<s.length(); i++)
            {
                char ch = s.charAt(i);
                if(uniq.containsKey(ch))
                {
                    uniq.put(ch, uniq.get(ch) + 1);
                }
                else 
                {
                    uniq.put(ch, 1);
                }
            }
            if(map.containsKey(uniq))
            {
                int index = map.get(uniq).intValue();
                ans.get(index).add(s);
            }
            else 
            {
                List<String> arr = new ArrayList<>();
                arr.add(s);
                ans.add(arr);
                map.put(uniq, c);
                c++;
            }
        }
        return ans;
    }
}