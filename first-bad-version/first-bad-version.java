/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) 
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        int left = 1;
        int right = n;
        int ans  = -1;
        while(left<right)
        {
            int mid = left + (right-left)/2;
            boolean check = isBadVersion(mid);
            if(!check)
            {
                left = mid+1;
            }
            else
            {
                ans = mid;
                right = mid;
            }            
        }
        if(isBadVersion(left))
            return left;
        return ans;
    }
}