class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i<arr.length; i++)
        {
            if(freq.containsKey(arr[i]))
            {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            }
            else 
            {
                freq.put(arr[i], 1);
            }
        }
        Set<Integer> se = new HashSet<>(freq.values());
        return freq.size() == se.size();
    }
}