class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length % 2 == 1)
            return (new int[0]);
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(changed);
        for(int i = 0; i<changed.length; i++)
        {
            if(map.containsKey(changed[i]))
                map.put(changed[i], map.get(changed[i]) + 1);
            else 
                map.put(changed[i], 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<changed.length; i++)
        {
            if(map.get(changed[i]) > 0)
            {
                ans.add(changed[i]);
                map.put(changed[i], map.get(changed[i]) - 1);
                if(!map.containsKey(changed[i] * 2))
                    return (new int[0]);
                if(map.get(changed[i] * 2) > 0)
                    map.put(changed[i] * 2, map.get(changed[i] * 2) - 1);
                else 
                    return (new int[0]);
            }
        }
        int[] ret = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++)
        {
            ret[i] = ans.get(i);
        }
        return ret;
    }
}