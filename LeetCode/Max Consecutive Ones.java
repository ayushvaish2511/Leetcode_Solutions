/*Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.*/

import java.util.*;
class Solution
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int maxc = 0;
        int c = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                if(c>maxc)
                   maxc = c;
                c = 0;
            }
            else 
            {
                c++;
            }
        }
        if(c>maxc)
            maxc = c;
        return maxc;
    }
}