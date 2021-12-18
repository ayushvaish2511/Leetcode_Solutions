/*You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

Input: nums = [3,6,1,0]
Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1.

Input: nums = [1,2,3,4]
Output: -1
Explanation: 4 is less than twice the value of 3, so we return -1.

Input: nums = [1]
Output: 0
Explanation: 1 is trivially at least twice the value as any other number because there are no other numbers.

1 <= nums.length <= 50
0 <= nums[i] <= 100
The largest element in nums is unique.*/


import java.util.*;
class Solution
{
    public int dominantIndex(int[] nums)
    {
        if(nums.length>1)
        {
            int max = nums[0];
            int smax = nums[1];
            int im = 0;
            for(int i = 0; i<nums.length; i++)
            {
                if(nums[i]>max)
                {
                    smax = max;
                    max = nums[i];
                    im = i;                    
                }
                else if(nums[i]>smax && nums[i]<max)
                    smax = nums[i];                
            }
            if(max >= (2*smax))
                return im;
            else 
                return -1;
        }
        else 
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        Solution ob = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println(ob.dominantIndex(a));
    }
}