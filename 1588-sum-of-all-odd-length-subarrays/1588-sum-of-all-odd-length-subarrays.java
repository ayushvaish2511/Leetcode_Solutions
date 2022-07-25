class Solution {
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int n = arr.length;
        int sum = arr[0];
        for(int i = 1; i<n; i++)
        {
            sum += arr[i];
            arr[i] += arr[i-1];
        }
        int left = -1;
        int right = 2;
        int size = 3;
        while(size<=n)
        {
            for(int i = right; i<n; i++)
            {
                if(left == -1)
                    sum += arr[i];
                else
                {
                    sum += arr[i] - arr[left];
                }
                left++;                
            }
            left = -1;
            right += 2;
            size += 2;
        }
        return sum;
    }
}