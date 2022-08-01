class NumArray {
    public int[] nums;
    public int sum;
    public NumArray(int[] nums) {
        this.nums = nums;
        sum = 0;
        
        for(int i = 0; i<nums.length; i++)
        {
           sum += nums[i]; 
        }
    }
    
    public void update(int index, int val) {
        sum = sum + val - nums[index];
        nums[index] = val;        
    }
    
    public int sumRange(int left, int right) {
        int s = sum;
        for(int i = 0; i<left; i++)
        {
            s -= nums[i];
        }
        for(int i = right+1; i<nums.length; i++)
        {
            s -= nums[i];
        }
        return s;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */