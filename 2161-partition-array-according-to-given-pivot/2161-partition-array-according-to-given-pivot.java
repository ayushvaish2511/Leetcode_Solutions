class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        ArrayList<Integer> sh = new ArrayList<>();
        ArrayList<Integer> lar = new ArrayList<>();
        int ce = 0;
        for(Integer i : nums)
        {
            if(i == pivot)
                ce++;
            else if(i < pivot)
                sh.add(i);
            else 
                lar.add(i);
        }
        int k = 0;
        for(int i = 0; i<sh.size(); i++)
        {
            nums[k++] = sh.get(i);
        }
        while(ce>0)
        {
            nums[k++] = pivot;
            ce--;
        }
        for(int i = 0; i<lar.size(); i++)
        {
            nums[k++] = lar.get(i);
        }
        return nums;
    }
}