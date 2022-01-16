class Solution {
    public int[] intersect(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = a.length;
        int n = b.length;
        for(int i = 0; i<m; i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i]) + 1);
            }
            else 
            {
                map.put(a[i], 1);
            }
        }
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i = 0; i<n; i++)
        {
            if(map.containsKey(b[i]))
            {
                if(map.get(b[i])>0)
                {
                    c.add(b[i]);
                    map.put(b[i], map.get(b[i])-1);
                }
            }
        }
        int[] ret = new int[c.size()];
        for(int i = 0; i<c.size(); i++)
        {
            ret[i] = c.get(i);
        }
        return ret;
    }
}