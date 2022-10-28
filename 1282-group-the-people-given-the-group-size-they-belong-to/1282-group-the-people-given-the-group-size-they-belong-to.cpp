class Solution {
public:
    vector<vector<int>> groupThePeople(vector<int>& gs) {
        vector<pair<int,int>>vec1;
        // vector<int>vec2;
        vector<vector<int>>ans;
        // int j=0;
        for(int i=0;i<gs.size();i++){
            vec1.push_back(make_pair(gs[i],i));
        }
        sort(vec1.begin(),vec1.end());
        sort(gs.begin(),gs.end());
        
        
        int i = 0;
        while(i<vec1.size())
        {
            int x = vec1[i].first;
            int j = i;
            vector<int> vec2;
            while(x!=0)
            {
                x--;
                vec2.push_back(vec1[j].second);
                j++;
            }
            i = j;
            ans.push_back(vec2);
        }
        
        
        
//         for(int i=0;i<vec1.size();i++)
//         {
//             vector<int>vec2;
//             int x=vec1[i].first;
                    
//             for(int j=i;j<i+x;j++)
//             {
//                 vec2.push_back(vec1[j].second);
//             }
//             // i=i+x;
//             // j--;
//             ans.push_back(vec2);
//         }
        return ans;
    }
};