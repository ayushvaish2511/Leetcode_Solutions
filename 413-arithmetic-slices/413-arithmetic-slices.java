class Solution {
    public int numberOfArithmeticSlices(int[] nums) 
    {
        if(nums.length<3)
            return 0;
        int c = 0;
        List<Integer> count = new ArrayList<>();
        int diff = nums[1] - nums[0];
        for(int i = 1; i<nums.length; i++)
        {
            if(nums[i]-nums[i-1] == diff)
                c++;
            else 
            {
                if(c>=2)
                    c++;
                count.add(c);
                c = 1;
                diff = nums[i]-nums[i-1];
            }
        }
        count.add(c+1);
        int ans = 0;
        for(int i = 0; i<count.size(); i++)
        {
            int cal = count.get(i);
            if(cal>0)
                ans += ((cal-2)*(cal-2+1))/2;
        }
        return ans;
    }
}