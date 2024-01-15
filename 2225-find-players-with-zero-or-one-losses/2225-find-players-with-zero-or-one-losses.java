class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int[] i : matches)
        {
            hs.add(i[0]);
            hs.add(i[1]);
            if(map.containsKey(i[1]))
            {
                map.put(i[1], map.get(i[1]) + 1);
            }
            else 
            {
                map.put(i[1], 1);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> mp : map.entrySet())
        {
            int key = mp.getKey().intValue();
            int val = mp.getValue().intValue();
            if(val == 1)
            {
                arr.add(key);
            }
            hs.remove(key);
        }
        List<Integer> a1 = new ArrayList<>();
        for(int i : hs)
        {
            a1.add(i);
        }
        Collections.sort(a1);
        Collections.sort(arr);
        ans.add(a1);
        ans.add(arr);
        return ans;
    }
}