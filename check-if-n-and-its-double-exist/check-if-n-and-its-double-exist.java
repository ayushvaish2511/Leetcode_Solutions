class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++)
        {
            int n = arr[i];
            if(map.containsKey(2*n) || (map.containsKey(n/2) && (n%2==0)))
                return true;
            map.put(n, true);
        }
        return false;
    }
}