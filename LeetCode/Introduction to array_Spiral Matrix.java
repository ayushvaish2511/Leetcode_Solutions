/* Given an m x n matrix, return all elements of the matrix in spiral order.
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
*/

import java.util.*;
import java.util.Arrays;
class Solution
{
    public List<Integer> spiralOrder(int[][] mat)
    {
        List<Integer> re = new ArrayList<Integer>();
        int m = mat.length;
        int n = mat[0].length;
        int sr = 0, sc = 0, lr = m-1, lc = n-1;
        while(sr<=lr && sc<=lc)
        {
            for(int i = sc; i<=lc; i++)
                re.add(mat[sr][i]);
            
            for(int i = sr+1; i<=lr; i++)
                re.add(mat[i][lc]);                
            if(sr<lr)
            {
                for(int i = lc-1; i>=sc; i--)
                    re.add(mat[lr][i]);
            }
            if(sc<lc)
            {
                for(int i = lr-1; i>sr; i--)
                   re.add(mat[i][sc]);
            }
            sc++;
            sr++;
            lc--;
            lr--;
            
        }
        return re;
    }
    public static void main(String args[])
    {
        Solution ob = new Solution();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(ob.spiralOrder(a)));
    }
}