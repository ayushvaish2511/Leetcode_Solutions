import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] newArray = new Integer[arr.length];
        int i = 0;
        for (int value : arr) 
        {
            newArray[i++] = Integer.valueOf(value);
        }  
        Arrays.sort(newArray, new Comparator<Integer>()
                    {
                        @Override
                        public int compare(Integer arg1, Integer arg2)
                        {
                            int c1 = Integer.bitCount(arg1);
                            int c2 = Integer.bitCount(arg2);
                            if(c1==c2)
                            {
                                if(arg1.intValue() < arg2.intValue())
                                    return -1;
                                else 
                                    return 1;
                            }
                            else if(c1 < c2)
                                return -1;
                            else 
                                return 1;
                        }
                    });
        
        for(i = 0; i<arr.length; i++)
        {
            arr[i] = newArray[i].intValue();
        }
        return arr;
    }
}