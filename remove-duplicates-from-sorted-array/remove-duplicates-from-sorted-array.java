class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n>0)
        {
            int curr = 0;
            int next = 1;
            int k = 1;
            for(int i = 1; i<nums.length; i++)
            {
                if(nums[i]!=nums[curr])
                {
                    int temp = nums[i];
                    nums[i] = nums[next];
                    nums[next] = temp;
                    next++;
                    curr++;
                    k++;
                }
            }
            return k;
        }
        else 
            return 0;
    }
}