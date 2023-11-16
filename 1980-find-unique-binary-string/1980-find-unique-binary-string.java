class Solution {
    public long convert(String n)
    {
        long a = 0;
        long mul = 1;
        for(int i = n.length()-1; i>=0; i--)
        {
            a += ((int)(n.charAt(i) - '0') * mul);
            mul *= 2;
        }
        return a;
    }
    public String findDifferentBinaryString(String[] nums) {
        HashSet<Long> hs = new HashSet<>();
        for(int i = 0; i<nums.length; i++)
        {
            hs.add(convert(nums[i]));
        }
        String ans = "";
        int limit = (int)Math.pow(2, nums[0].length());
        for(int i = limit-1; i>=0; i--)
        {
            if(!hs.contains((long)i))
            {
                System.out.print(i);
                for (int j = nums[0].length()-1; j >= 0; j--) 
                {
                    int k = i >> j;
                    if ((k & 1) > 0)
                        ans += "1";
                    else
                        ans += "0";
		        }
                break;
            }
        }
        return ans;
    }
}