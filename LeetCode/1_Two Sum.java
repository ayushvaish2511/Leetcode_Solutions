class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n = nums.length;
        int ans[] = new int[2];
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 0; i<n; i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + i);
            else 
                map.put(nums[i], ""+i);
        }
        for(int i = 0; i<n; i++)
        {
            int a = target-nums[i];         //To get the value of another variable which needs to be searched
            if(map.containsKey(a))
            {
                if(nums[i] == a)                //To check if the no. same or not then check if frequency of that no. is twice or not
                {
                    if(map.get(a).length()>1)
                    {
                        ans[0] = Integer.parseInt(map.get(a).charAt(0) + "");
                        ans[1] = Integer.parseInt(map.get(a).charAt(1) + "");
                        break;
                    }                    
                }
                else 
                {
                    ans[0] = i;
                    ans[1] = Integer.parseInt(map.get(a) + "");
                    break;
                }                
            }
        }
        return ans;
    }
}