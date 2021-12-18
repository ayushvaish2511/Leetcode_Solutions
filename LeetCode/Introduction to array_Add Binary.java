/*Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.*/

import java.util.*;
class Solution
{
    public String addBinary(String a, String b)
    {
        StringBuilder re = new StringBuilder();
        int i = a.length()-1, j = b.length()-1;
        int s = 0;
        while(i>=0 || j>=0 || s==1)
        {
            if(s==0)
            {
                int ele;
                if(i>=0 && j>=0)
                {
                    ele = Integer.parseInt(a.charAt(i)+"") + Integer.parseInt(b.charAt(j)+"");
                }
                else if(i>=0)
                {
                    ele = Integer.parseInt(a.charAt(i)+"");
                }
                else if(j>=0)
                {
                    ele = Integer.parseInt(b.charAt(j)+"");
                }
                else 
                {
                    ele = 0;
                }
                if(ele <= 1)
                {
                    re.insert(0, Integer.toString(ele));
                    s = 0;
                }
                else
                {
                    s = 1;
                    re.insert(0, Integer.toString(0));
                }
            }
            else 
            {
                int ele;
                if(i>=0 && j>=0)
                {
                    ele = Integer.parseInt(a.charAt(i)+"") + Integer.parseInt(b.charAt(j)+"") + s;
                }
                else if(i>=0)
                {
                    ele = Integer.parseInt(a.charAt(i)+"") + s;
                }
                else if(j>=0)
                {
                    ele = Integer.parseInt(b.charAt(j)+"") + s;
                }
                else 
                {
                    ele = 0+s;
                }
                if(ele <= 1)
                {
                    re.insert(0, Integer.toString(ele));
                    s = 0;
                }
                else if(ele==2)
                {
                    s = 1;
                    re.insert(0, Integer.toString(0));
                }
                else 
                {
                    s = 1;
                    re.insert(0, Integer.toString(1));
                }
            }
            i--;
            j--;
        }
        return re.toString();
    }
}