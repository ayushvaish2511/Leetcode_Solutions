class Solution {
public:
    vector<vector<int>> mergeSimilarItems(vector<vector<int>>& items1, vector<vector<int>>& items2) {
        vector<vector<int>>vec;
        vector<vector<int>>ans;
        for(int i=0;i<items1.size();i++){
            vec.push_back(items1[i]);
        }
        for(int i=0;i<items2.size();i++){
            vec.push_back(items2[i]);
        }
        sort(vec.begin(),vec.end());
        int i = 0;
        while(i < vec.size()-1)
        {
            if(vec[i][0] == vec[i+1][0])
            {
                int sum = vec[i][1] + vec[i+1][1];
                ans.push_back({vec[i][0], sum});
                i+=2;                
            }
            else 
            {
                ans.push_back({vec[i][0], vec[i][1]});
                i++;
            }
        }
        if(i == vec.size()-1)
            ans.push_back({vec[i][0], vec[i][1]});   
        return ans;
    }
};