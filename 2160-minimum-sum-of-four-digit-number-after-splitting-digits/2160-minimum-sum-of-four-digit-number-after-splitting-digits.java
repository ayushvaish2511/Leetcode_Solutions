class Solution {
    public int minimumSum(int num) 
    {
        String n = num+"";
        char[] a = n.toCharArray();
        Arrays.sort(a);
        int num1 = Integer.parseInt(a[0] + "" + a[2]);
        int num2 = Integer.parseInt(a[1] + "" + a[3]);
        return num1+num2;
    }
}