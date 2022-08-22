class Solution {
    public boolean isPowerOfFour(int n) 
    {
        double a = (Math.log(n)*1.0)/Math.log(4.0);
        if((int)a == a)
            return true;
        return false;
    }
}