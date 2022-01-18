import java.util.StringTokenizer;
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, String> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i<nums.length; i++)
        {
            int ele = target - nums[i];
            if(map.containsKey(ele))
            {
                StringTokenizer ind = new StringTokenizer(map.get(ele));
                int index = Integer.parseInt(ind.nextToken());
                ans[0] = index;
                ans[1] = i;
                break;
            }
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + " " + i);
            }
            else 
            {
                map.put(nums[i], "" + i);
            }
        }
        return ans;
    }
}