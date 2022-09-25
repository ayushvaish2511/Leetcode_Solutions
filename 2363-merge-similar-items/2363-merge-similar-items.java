class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<items1.length; i++)
        {
            map.put(items1[i][0], items1[i][1]);
        }
        for(int i = 0; i<items2.length; i++)
        {
            if(map.containsKey(items2[i][0]))                
            {
                map.put(items2[i][0], map.get(items2[i][0]) + items2[i][1]);
            }
            else 
            {
                map.put(items2[i][0], items2[i][1]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> m : map.entrySet())
        {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(m.getKey());
            temp.add(m.getValue());
            ans.add(temp);
        }
        Collections.sort(ans, new Comparator<List<Integer>>(){
            @Override
            public int compare(List<Integer> a, List<Integer> b)
            {
                return a.get(0) < b.get(0) ? -1 : 1; 
            }
        });
        return ans;
    }
}