/*Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.

 Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]
Example 2:

Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]

*/

//Total cycles will be (m+n-1) always

import java.util.*;
import java.util.Arrays;
class Solution
{
    public int[] findDiagonalOrder(int[][] mat)
    {
        int m = mat.length;
        int n = mat[0].length;
        int[] re = new int[m*n];
        if(m==0)
            return mat[0];
        int r = 0, c = 0;
        for(int i = 0; i<m*n; i++)
        {
            re[i]= mat[r][c];
            if(((r+c)%2)==0)         //If sum is even which means we have to come upstairs
            {
                if(c==n-1)
                {
                    r++;
                }
                else if(r==0)
                {
                    c++;
                }
                else 
                {
                    r--;
                    c++;
                }
            }
            else        //If sum is odd which means we have to go downstairs
            {
                if(r==m-1)
                {
                    c++;
                }
                else if(c==0)
                {
                    r++;
                }
                else
                {
                    r++;
                    c--;
                }
            }
        }
        return re;
    }
    public static void main(String args[])
    {
        Solution ob = new Solution();
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
                a[i][j] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ob.findDiagonalOrder(a)));
    }
}