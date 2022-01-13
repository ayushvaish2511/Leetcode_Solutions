import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        for(int i = 0; i<nums.length; i++)
        {
            if(hp.containsKey(nums[i]))
                return true;
            hp.put(nums[i], 1);
        }
        return false;        
    }
}