class Solution {
    public void duplicateZeros(int[] arr) {
        int c = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == 0)
                c++;
        }
        int len = arr.length + c;
        int i = arr.length-1;
        int j = len-1;
        while(i<j)
        {
            if(arr[i]!=0)
            {
                if(j<arr.length)
                {
                    arr[j] = arr[i];
                }
            }
            else 
            {
                if(j<arr.length)
                    arr[j] = arr[i];
                j--;
                if(j<arr.length)
                    arr[j] = arr[i];
            }
            i--;
            j--;
        }        
    }
}