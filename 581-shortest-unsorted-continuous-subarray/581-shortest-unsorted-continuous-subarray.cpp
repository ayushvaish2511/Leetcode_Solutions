class Solution {
public:
    int findUnsortedSubarray(vector<int>& nums) {
        vector<int> a = nums;
        sort(nums.begin(), nums.end());
        int c = 0;
        int i = 0;
        for(i=0;i<nums.size();i++){
            if(nums[i]!=a[i])
            {
                break;
            }
        }
        int j = nums.size()-1;
        for(; j>i; j--)
        {
            if(nums[j] != a[j])
            {
                break;
            }
        }
        return j-i+1;
    }
};