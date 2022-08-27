class Solution {
public:
    int maxDepth(string s) {
//         int count = 0, dg = 0,k;
//         int mdg = INT_MIN;
//         for(int i=0;i<s.size();i++){
//             if(isdigit(s[i]))
//                 dg = s[i];
//             if(mdg<dg){
//                 mdg = dg;
//                 k = i;
//             }
                
//         }
        int count = 0;
        int max = 0;
        for(int i=0;i<s.size();i++){
            if(s[i]=='(')
                count++;
            else if(s[i]==')')
                count--;
            if(count > max)
                max = count;
        }
        return max;
    }
};