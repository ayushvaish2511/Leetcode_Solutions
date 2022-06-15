class Solution {
    public int longestStrChain(String[] words) 
    {
        List<Set<String>> w = new ArrayList<>(17);
        for(int i = 0; i<17; i++)
        {
            w.add(new HashSet<>());
        }
        for(String word: words)
        {
            w.get(word.length()).add(word);
        }
        HashMap<String, Integer> dp = new HashMap<>();
        int max = 1;
        for(int i = 16; i>=1; i--)
        {
            if(w.get(i-1).isEmpty())
            {
                continue;
            }
            for(String word: w.get(i))
            {
                int wVal = dp.getOrDefault(word, 1);
                for(int j = 0; j<word.length(); j++)
                {
                    String pred = word.substring(0, j) + word.substring(j+1);
                    if(w.get(i-1).contains(pred) && wVal >= dp.getOrDefault(pred, 1))
                    {
                        dp.put(pred, wVal+1);
                        max = Math.max(max, wVal+1);
                    }
                }
            }
        }
        return max;
    }
}