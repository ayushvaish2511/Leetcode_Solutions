class Solution {
    public int brokenCalc(int startValue, int target) 
    {
        int c = 0;
        while(target > startValue)
        {
            c++;
            if(target % 2 !=0)
            {
                target++;
                c++;
            }
            target /= 2;
        }
        c += startValue - target;
        return c;
    }
}