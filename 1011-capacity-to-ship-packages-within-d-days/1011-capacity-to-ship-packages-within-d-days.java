class Solution {
    public int getLoad(int[] weights, int capacity)
    {
        int d = 0;
        int curr = 0;
        for(int i : weights)
        {
            curr += i;
            if(curr > capacity)
            {
                curr = i;
                d++;
            }
        }
        return d+1;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = weights[0];
        int high = weights[0];
        for(int i = 1; i<weights.length; i++)
        {
            low = low > weights[i] ? low : weights[i];
            high += weights[i];
        }
        while(low<=high)
        {
            int mid = (low + high)/2;
            int d = getLoad(weights, mid);
            if(d <= days)
            {
                high = mid - 1;
            }
            else 
            {
                low = mid + 1;
            }
        }
        return low;
    }
}