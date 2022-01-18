class Solution {
    public int indOf(int[] a, int key, int l, int r)
    {
        while(l<=r)
        {
            int m = (l+r)/2;
            if(a[m]==key)
                return m;
            if(a[m]<key)
                l = m+1;
            else 
                r = m-1;
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target)
    {
        int re[] = new int[2];
        for(int i = 0; i<numbers.length-1; i++)
        {
            int a = numbers[i];
            int ele = target - a;
            int j = indOf(numbers, ele, i+1, numbers.length-1);
            if(j!=-1)
            {
                re[0] = i+1;
                re[1] = j+1;
                break;
            }
        }
        return re;
    }
}