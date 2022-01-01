class Solution {
    public int gcd(int a, int b)
    {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    public int findGCD(int[] nums) 
    {
        int min = nums[0], max = nums[0];
        for(int i = 1; i<nums.length; i++)
        {
            min = nums[i] < min ? nums[i] : min;
            max = nums[i] > max ? nums[i] : max;
        }
        return gcd(max, min);
    }
}