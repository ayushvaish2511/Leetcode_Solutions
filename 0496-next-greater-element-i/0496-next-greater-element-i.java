class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i = nums2.length-1; i>=0; i--)
        {
            if(st.empty())
            {
                map.put(nums2[i], -1);   
            }
            else 
            {
                int ele = -1;
                while(!st.empty())
                {
                    if(st.peek() > nums2[i])
                    {
                        ele = st.peek();
                        break;
                    }
                    st.pop();
                }
                map.put(nums2[i], ele);
            }            
            st.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++)
        {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}