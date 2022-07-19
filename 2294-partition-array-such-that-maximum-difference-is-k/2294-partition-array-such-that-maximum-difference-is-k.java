class Solution 
{
    // public int diff(ArrayList<Integer> arr)
    // {
    //     int max = arr.get(0);
    //     int min = arr.get(1);
    //     for(int i = 1; i<arr.size(); i++)
    //     {
    //         if(arr.get(i) > max)
    //             max = arr.get(i);
    //         if(arr.get(i) < min)
    //             min = arr.get(i);
    //     }
    //     return max - min;
    // }
    public int partitionArray(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int c = 0;
        int minI = 0;
        int maxI = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++)
        {
            int diff = nums[i] - nums[minI];
            if(diff <= k)
            {
                continue;
            }
            else 
            {
                minI = i;
                c++;
            }
        }
        return c+1;
        
        
        
        
        
        
        
        
        
        
        
//         ArrayList<Integer> arr = new ArrayList<>();
//         for(int i = 0; i<nums.length; i++)
//         {
//             arr.add(nums[i]);
//         }
//         ArrayList<Integer> temp = new ArrayList<>();
//         int i = 1;
//         int currMax = arr.get(0);
//         int currMin = arr.get(0);
//         int c = 0;
//         while(arr.size()!=0)
//         {
//             if(i>=temp.size())
//             {
//                 i = 0;
//                 c++;
//                 temp.clear();
//                 currMax = arr.get(0);
//                 currMin = arr.get(0);
//             }
//             temp.add(arr.get(i));
//             if(arr.get(i) > currMax)
//             {
//                 currMax = arr.get(i);
//             }
//             else if(arr.get(i) < currMin)
//             {
//                 currMin = arr.get(i);
//             }
//             int diff = currMax - currMin;
//             if(diff <= k)
//             {
//                 arr.remove(i);
//             }
//             else if(i<arr.size())
//             {
//                 i++;
//                 temp.remove(temp.size()-1);
//             }
//             else if(i == arr.size()-1)
//             {
//                 i = 0;
//                 c++;
//                 temp.clear();
//                 currMax = arr.get(0);
//                 currMin = arr.get(0);
//             }
// //             if(i>=n)
// //             {
// //                 i = 0;
// //                 temp.removeAll();
// //             }
// //             if(temp.size() == 0)
// //             {
// //                 temp.add(arr.get(0));
// //             }
// //             else if(arr.size() > 0 && diff(arr) <= k)
// //             {
                
// //             }
//         }
//         return c+1;
    }
}