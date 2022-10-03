class Solution {
public:
    void duplicateZeros(vector<int>& arr) 
    {
        int c = 0;
        for(int i = 0; i<arr.size(); i++)
        {
            if(arr[i] == 0)
                c++;
        }
        int i = arr.size()-1;
        int j = arr.size()+c-1;
        while(i<j)
        {
            if(arr[i] != 0)
            {
                if(j<arr.size())
                {
                    arr[j] = arr[i];
                }
            }
            else 
            {
                if(j<arr.size())
                {
                    arr[j] = arr[i];
                }
                j--;
                 if(j<arr.size())
                {
                    arr[j] = arr[i];
                } 
            }
            i--;
            j--;
        }
    }
};