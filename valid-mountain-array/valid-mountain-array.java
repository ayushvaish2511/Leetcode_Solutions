class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<=2)
            return false;
        int flag = 0;
        int i = 0;
        for(i = 0; i<arr.length-1; i++)
        {
            if(arr[i]==arr[i+1])
            {
                return false;
            }
            else if(arr[i]>arr[i+1])
                break;
        }
        if(i==0 || i==arr.length-1)
        {
            return false;
        }
        for( ; i<arr.length-1; i++)
        {
            if(arr[i]==arr[i+1])
            {
                return false;
            }
            else if(arr[i]<arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
}