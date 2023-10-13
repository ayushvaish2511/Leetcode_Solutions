class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        for(int i = n-1; i>=0; i--)
        {
            while(!st.empty() && st.peek() <= nums[i])
            {
                st.pop();
            }
            st.push(nums[i]);
        }
        int[] ans = new int[n];
        for(int i = n-1; i>=0; i--)
        {
            while(!st.empty() && st.peek() <= nums[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                ans[i] = -1;
            }
            else
            {
                ans[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return ans;
    }
}