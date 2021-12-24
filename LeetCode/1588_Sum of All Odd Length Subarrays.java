class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i<n; i++)
        {
            sum = sum + (((i+1)*(n-i)+1)/2)*arr[i];
        }
        return sum;
    }
}



/*For any element at index idx there are (idx + 1) choices on the left side of it and (N – idx) choices on the right side of it.
Therefore, for any element arr[i], the count of arr[i] is (i + 1) * (N – i) in all the subarrays.
So, for an element arr[i], there are ((i + 1) * (N – i) + 1) / 2 sub-arrays with odd length.
Finally, arr[i] will have a total of ((i + 1) * (n – i) + 1) / 2 frequency in the sum.*/

/*We can analyse that if we take all subarrays (even and odd length), then in that case a particular element at index i will occur in all subarrays whose starting index is less than equal to i, and ending index is greater than equal to i.

Therefore we can say that total number of those subarrays which contains arr[i] (0-indexed) will be equal to (i+1)*(n-i).
Let this value to be x.
Out of which there are (x+1)/2 odd length subarrays which contains arr[i].
And x/2 even length subarrays which contains arr[i].
Hence a[i] will contribute (x+1)/2 times in the total sum in our solution.*/