class Solution {
    public class Pairs{
        char ch;
        int freq;
        Pairs(char ch, int freq)
        {
            this.ch = ch;
            this.freq = freq;
        }
    }
    public String frequencySort(String s) {
        PriorityQueue<Pairs> pq = new PriorityQueue<Pairs>((node1, node2) -> Integer.compare(node2.freq, node1.freq));
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
        for(Map.Entry<Character, Integer> mp : map.entrySet())
        {
            Pairs ob = new Pairs(mp.getKey().charValue(), mp.getValue().intValue());
            pq.add(ob);
        }
        StringBuilder ans = new StringBuilder("");
        while(!pq.isEmpty())
        {
            Pairs temp = pq.poll();
            for(int i = 0; i<temp.freq; i++)
            {
                ans.append(temp.ch + "");
            }
        }
        return ans.toString();
    }
}