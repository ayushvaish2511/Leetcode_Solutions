class Solution {
    public int combinationSum4(int[] nums, int target) {
        Integer[] arr = new Integer[target+1];
        return request(nums,  target,  arr);
    }
    public int request(int[] nums, int target, Integer[] arr){
        if(target<0) return 0;
        if(arr[target]!=null) return arr[target];
        if(target==0) return 1;
        
        int ans=0;
        
        for(int i = 0;i<nums.length;i++){
            ans+=request(nums, target-nums[i], arr);
        }

               
        arr[target] = ans;

    return arr[target];
    }
    
}