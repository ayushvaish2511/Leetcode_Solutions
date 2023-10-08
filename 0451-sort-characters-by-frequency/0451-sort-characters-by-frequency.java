class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);
            }
            else 
            {
                map.put(ch, 1);
            }
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        StringBuilder ans = new StringBuilder("");
        while(!pq.isEmpty())
        {
            char p = pq.poll();
            for(int i = 0; i<map.get(p); i++)
            {
                ans.append(p);
            }
        }
        return ans.toString();
    }
}