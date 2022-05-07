class Solution {
    public boolean find132pattern(int[] nums) 
    {
        int arr[] = new int[nums.length];
        arr[0] = nums[0];
        for(int i = 1; i<nums.length; i++)
        {
            arr[i] = Math.min(nums[i], arr[i-1]);
        }
        Stack<Integer> st = new Stack<>();
        for(int i = nums.length-1; i>0; i--)
        {
            if(nums[i]>arr[i])
            {
                while(!st.isEmpty() && st.peek()<=arr[i])
                {
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()<nums[i])
                {
                    return true;
                }
                st.push(nums[i]);
            }
        }
        return false;
    }
}