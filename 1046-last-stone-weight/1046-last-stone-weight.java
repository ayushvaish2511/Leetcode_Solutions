import java.util.Collections;
class Solution {
    public int lastStoneWeight(int[] stones) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<stones.length; i++)
        {
            arr.add(stones[i]);
        }
        while(arr.size()>1)
        {
            Collections.sort(arr);
            int l = arr.size();
            int addE = arr.get(l-1) - arr.get(l-2);
            arr.remove(l-1);
            arr.remove(l-2);
            if(addE != 0)
                arr.add(addE);
        }
        if(arr.size() == 1)
            return arr.get(0);
        return 0;
    }
}