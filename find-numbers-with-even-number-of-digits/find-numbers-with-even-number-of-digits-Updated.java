class Solution {
    public int findNumbers(int[] nums) 
    {
        int c = 0;
        for(int i = 0; i<nums.length; i++)
        {
            // if((Integer.toString(nums[i]).length()) % 2 == 0)
            //     c++;
            int d = 0;
            while(nums[i]!=0)
            {
                d++;
                nums[i] = nums[i]/10;
            }
            if(d%2==0)
                c++;
        }
        return c;
    }
}
