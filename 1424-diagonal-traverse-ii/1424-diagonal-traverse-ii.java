class Solution {
    public class Pair
    {
        int row, col;
        Pair(int a, int b)
        {
            row = a;
            col = b;
        }
    }
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        TreeMap<Integer, ArrayList<Pair>> map = new TreeMap<>();
        int c = 0;
        for(int i = 0; i<nums.size(); i++)
        {
            for(int j = 0; j<nums.get(i).size(); j++)
            {
                c++;
                int sum = i + j;
                Pair temp = new Pair(i, j);
                ArrayList<Pair> arr;
                if(map.containsKey(sum))
                {
                    arr = map.get(sum);
                }
                else 
                {
                    arr = new ArrayList<Pair>();
                }
                arr.add(temp);
                map.put(sum, arr);
            }
        }
        int[] ans = new int[c];
        int index = 0;
        for (Map.Entry<Integer, ArrayList<Pair>> mp : map.entrySet())
        {
            ArrayList<Pair> arr = mp.getValue();
            Collections.sort(arr, new Comparator<Pair>() {
                @Override
                public int compare(Pair a, Pair b)
                {
                    Integer r1 = Integer.valueOf(a.row);
                    Integer r2 = Integer.valueOf(b.row);
                    return r1.compareTo(r2);
                }
            });
            int size = arr.size();
            for(int i = size-1; i>=0; i--)
            {
                Pair temp = arr.get(i);
                ans[index++] = nums.get(temp.row).get(temp.col);
            }
        }
        return ans;
    }
}