class Solution {
    public int threeSumMulti(int[] arr, int target) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        long result = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(map.containsKey(target - arr[i] - arr[j]))
                {
                    result += map.get(target - arr[i] - arr[j]);
                }
                result %= 1000000007;
            }
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }
        return (int)result % 1000000007;
    }
}