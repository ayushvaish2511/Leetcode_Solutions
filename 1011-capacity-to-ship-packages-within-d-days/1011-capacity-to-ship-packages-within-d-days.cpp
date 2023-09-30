class Solution {
public:
    int getdays(vector<int>& weights , int mid)
    {
        int k = 0, repo = 0;
        for(int i =0;i<weights.size();i++)
        {
            k += weights[i];
            if(k>mid)
            {
                k = weights[i];
                // i--;
                repo++;
            }
        }
        return repo+1;
    }
    int shipWithinDays(vector<int>& weights, int days) 
    {    
        int low =0 , high =0;
        for(int i =0;i<weights.size();i++)
        {
          low = max(low, weights[i]);
            high += weights[i];
        }
         while(low<=high)
         {
             int mid= ((high + low)/2);
             int out = getdays(weights , mid);

             if(out>days)
             {
                 low= mid+1;
             }
             else if(out<=days)
             {
                 high= mid-1;

             }
             // else
             // {
             //     high = mid;
             // }


         }
     return low;
         
    }
};