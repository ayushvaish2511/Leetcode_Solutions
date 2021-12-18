/*Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

 

Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 

Constraints:

2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
The tests are generated such that there is exactly one solution. */

import java.util.*;
class Solution
{
    public int indOf(int[] a, int key, int l, int r)
    {
        while(l<=r)
        {
            int m = (l+r)/2;
            if(a[m]==key)
                return m;
            if(a[m]<key)
                l = m+1;
            else 
                r = m-1;
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target)
    {
        int re[] = new int[2];
        for(int i = 0; i<numbers.length-1; i++)
        {
            int a = numbers[i];
            int ele = target - a;
            int j = indOf(numbers, ele, i+1, numbers.length-1);
            if(j!=-1)
            {
                re[0] = i+1;
                re[1] = j+1;
                break;
            }
        }
        return re;
    }
}