class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> ans;
        int e = extraCandies;
        
        for(int i=0;i<candies.size();i++)
        {
            int c=0;
            for(int j=0;j<candies.size();j++)
            {
                if(candies[i]+e>=candies[j])
                    c++;
            }
            if (c==(candies.size()))
                ans.push_back(1);
            else
               ans.push_back(0);
        }
        return ans;
        
        // int max = *max_element(candies.begin(),candies.end());
        // for(int i=0;i<candies.size();i++){
        //     int a = candies[i]+extraCandies;
        //     if(a>=max){
        //         ans.push_back(1);
        //     }
        //     else
        //         ans.push_back(0);
        // }
        // return ans;
    }
};