class Solution {
    public int maximum69Number (int num) 
    {
        String n = String.valueOf(num);
        for(int i = 0; i<n.length(); i++)
        {
            if(n.charAt(i) == '6')
            {
                n = n.substring(0, i) + "9" + n.substring(i+1);
                break;
            }
        }
        return Integer.parseInt(n);
        // ArrayList<Integer> li = new ArrayList<>();
        // int copy = num;
        // while(copy>0)
        // {
        //     li.add(copy%10);
        //     copy = copy/10;
        // }
        // int[] arr = new int[li.size()];
        // int k = 0;
        // for(int i = li.size()-1; i>=0; i--)
        // {
        //     arr[k++] = li.get(i);
        // }
        // for(int i = 0; i<)
    }
}