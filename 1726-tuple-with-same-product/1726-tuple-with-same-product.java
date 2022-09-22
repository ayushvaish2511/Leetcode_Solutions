class Solution {
    public long nCr(int n)
    {
        return fact(n) / ((fact(n-2) * 2));
    }
    public long fact(int n)
    {
        if(n == 0)
            return 1;
        long res = 1;
        for(int i = 2; i<=n; i++)
            res *= i;
        return res;
    }
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                int prod = nums[i] * nums[j];
                if(map.containsKey(prod))
                    map.put(prod, map.get(prod) + 1);
                else 
                    map.put(prod, 1);
            }
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> mpEle : map.entrySet())
        {
            int val = (mpEle.getValue()).intValue();
            if(val <= 2)
                ans += val/2;
            else 
            {
                ans += nCr(val);   
            }
        }
        return ans*8;
    }
}

/*
6
8
12
12
18
24





10

10
20
20

4C2

0011 
0101
1001
1100
1010
0110


1100
0110
0011
1001
1010
0101




12  2  8

24  4  8  8  8

48  2  8
*/
