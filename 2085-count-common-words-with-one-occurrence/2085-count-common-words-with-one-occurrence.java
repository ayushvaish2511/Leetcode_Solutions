class Solution {
    public int countWords(String[] a, String[] b) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<a.length; i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i], 3);
            }
            else
            {
                map.put(a[i], 1);
            }
        }
        for(int j = 0; j<b.length; j++)
        {
            if(map.containsKey(b[j]))
            {
                map.put(b[j], map.get(b[j])+1);
            }
        }
        int c = 0;
        for(int values : map.values())
        {
            if(values == 2)
                c++;
        }
        return c;
    }
}