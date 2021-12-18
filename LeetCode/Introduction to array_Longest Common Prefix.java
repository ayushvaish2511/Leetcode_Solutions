/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.*/

import java.util.*;
class Solution
{
    public int findMin(String[] a)
    {
        int m = a[0].length();
        for(int i = 1; i<a.length; i++)
        {
            if(a[i].length()<m)
            {
                m = a[i].length();
            }
        }
        return m;
    }

    public String longestCommonPrefix(String[] strs)
    {
        int min = findMin(strs);
        StringBuilder re = new StringBuilder("");
        for(int i = 0; i<min; i++)
        {
            char c = strs[0].charAt(i);
            for(int j = 1; j<strs.length; j++)
            {
                if(strs[j].charAt(i)!=c)
                {
                    return re.toString();
                }                
            }
            re.append(c);
        }
        return re.toString();
    }
}