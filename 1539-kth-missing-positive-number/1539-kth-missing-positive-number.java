class Solution {
    public int findKthPositive(int[] arr, int k) {
        int c = 0;
        int i = 0;
        int curr = 1;
        while(curr <= 10000000)
        {
            if(i < arr.length && arr[i] == curr)
            {
                i++;
            }
            else 
            {
                c++;
                if(c == k)
                {
                    return curr;
                }
            }
            curr++;
        }
        return curr;
    }
}