class Solution {
    public List<Integer> twoOutOfThree(int[] a, int[] b, int[] c) 
    {
        HashMap<Integer, Boolean> freq1 = new HashMap<>();
        HashMap<Integer, Boolean> freq2 = new HashMap<>();
        HashMap<Integer, Boolean> freq3 = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<a.length; i++)
        {
            freq1.put(a[i], true);
        }
        for(int i = 0; i<b.length; i++)
        {
            if(!freq2.containsKey(b[i]))
            {
                if(freq1.containsKey(b[i]))
                    ans.add(b[i]);
                freq2.put(b[i], true);
            }
        }
        for(int i = 0; i<c.length; i++)
        {
            if(!freq3.containsKey(c[i]))
            {
                if(freq1.containsKey(c[i]) && freq2.containsKey(c[i]))
                    continue;
                else if(freq1.containsKey(c[i]) || freq2.containsKey(c[i]))
                    ans.add(c[i]);
                freq3.put(c[i], true);
            }
            
        }
        return ans;
    }
}