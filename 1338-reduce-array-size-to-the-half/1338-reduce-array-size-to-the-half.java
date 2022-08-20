class Solution {
    public int minSetSize(int[] arr) 
    {
        int n = arr.length;
        int req = n/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++)
        {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else 
                map.put(arr[i], 1);
        }
        int unique = map.size();
        int[] freq = new int[unique];
        int i = 0;
        for(Map.Entry<Integer, Integer> m : map.entrySet())
        {
            int val = (m.getValue()).intValue();
            freq[i++] = val;
        }
        Arrays.sort(freq);
        int ans = 0;
        int c = 0;
        for(i = unique-1; i>=0; i--)
        {
            c += freq[i];
            ans++;
            if(c>=req)
                break;
        }
        return ans;
    }
}