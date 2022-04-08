import java.util.Collections;
class KthLargest {
    int k;    
    ArrayList<Integer> li = new ArrayList<>();
    public KthLargest(int k, int[] nums) 
    {
        this.k = k;
        for(int i = 0; i<nums.length; i++)
        {
            li.add(nums[i]);
        }
    }
    public int add(int val) 
    {
        li.add(val);
        Collections.sort(li);
        return li.get(li.size()-k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */