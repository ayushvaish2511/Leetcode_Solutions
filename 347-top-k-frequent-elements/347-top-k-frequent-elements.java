class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxfreq = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else 
                map.put(nums[i], 1);
            maxfreq = maxfreq > map.get(nums[i]) ? maxfreq : map.get(nums[i]);
        }
        LinkedList<Integer>[] bucketlist = new LinkedList[maxfreq+1];   
        for(int i = 0; i<=maxfreq; i++)
        {
            bucketlist[i] = new LinkedList<Integer>();
        }
        for(Integer key : map.keySet())
        {
            int freq = map.get(key);
            bucketlist[freq].add(key);
        }
        int[] ans = new int[k];
        int c = 0;
        for(int i = maxfreq; i>=0; i--)
        {
            for(int j : bucketlist[i])
            {
                if(c<k)
                {
                    ans[c++] = j;
                }
                else 
                {
                    break;
                }
            }
        }
        return ans;
    }
}