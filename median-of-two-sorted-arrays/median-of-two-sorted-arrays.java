class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        if(n>m)
            return findMedianSortedArrays(b, a);
        int strt = 0;
        int end = n;
        int midMerged = (n+m+1)/2;
        while(strt <= end)
        {
            int mid = (strt + end)/2;
            int leftSizeA = mid;
            int leftSizeB = midMerged - mid;
            
            int leftA = leftSizeA > 0 ? a[leftSizeA-1] : Integer.MIN_VALUE;
            int leftB = leftSizeB > 0 ? b[leftSizeB-1] : Integer.MIN_VALUE;
            int rightA = leftSizeA < n ? a[leftSizeA] : Integer.MAX_VALUE;
            int rightB = leftSizeB < m ? b[leftSizeB] : Integer.MAX_VALUE;
            
            if(leftA <= rightB && leftB <= rightA)
            {
                if((n+m)%2 == 0)
                {
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB))/2.0;
                }
                return Math.max(leftA, leftB);
            }
            else if(leftA > rightB)
            {
                end = mid - 1;
            }
            else 
            {
                strt = mid + 1;
            }
        }
        return 0.0;
    }
}