class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) 
    {
        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();
        for(String word : words1)
        {
            HashMap<String, Integer> counter = new HashMap<>();
            for(int i = 0; i<word.length(); i++)
            {
                String ch = word.charAt(i)+"";
                if(counter.containsKey(ch))
                    counter.put(ch, counter.get(ch)+1);
                else
                    counter.put(ch, 1);
            }
            map.put(word, counter);
        }
        HashMap<String, Integer> test = new HashMap<>();
        for(String word: words2)
        {
            HashMap<String, Integer> c = new HashMap<>();
            for(int i = 0; i<word.length(); i++)
            {
                String ch = word.charAt(i)+"";
                if(c.containsKey(ch))
                    c.put(ch, c.get(ch)+1);
                else
                    c.put(ch, 1);
            }
            for(Map.Entry<String, Integer> set :c.entrySet()) 
            {
                String key = set.getKey();
                int val = set.getValue();
                if(test.containsKey(key))
                {
                    val = (int)Math.max(val, test.get(key));
                    test.put(key, val);
                }
                else
                {
                    test.put(key, val);
                }
            }        
        }
        List<String> ans = new ArrayList<>();
        // System.out.println(test);
        for(String word : words1)
        {
            HashMap<String, Integer> check = new HashMap<>();
            check = new HashMap<>(map.get(word));
            boolean flag = false;
            // System.out.println(check);
            for (Map.Entry<String, Integer> set :test.entrySet()) 
            {
                String key = (set.getKey());
                int val = set.getValue();
                if(!check.containsKey(key))
                {
                    flag = true;
                    break;
                }   
                else if(check.get(key)<val)
                {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                ans.add(word);
            }
        }
        return ans;
    }
}