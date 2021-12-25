import java.util.Arrays;
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int strt = 0, end = nums.length-1;
        int max = nums[0]+nums[nums.length-1];
        while(strt<=end)
        {
            int sum = nums[strt] + nums[end];
            if(sum>max)
                max = sum;
            strt++;
            end--;
        }
        return max;
    }
}