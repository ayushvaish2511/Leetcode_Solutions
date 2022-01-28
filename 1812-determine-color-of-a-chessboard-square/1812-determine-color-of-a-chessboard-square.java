class Solution {
    public boolean squareIsWhite(String coordinates) {
        int i = coordinates.charAt(0);
        int j = Integer.parseInt(coordinates.charAt(1) + "");
        if(i%2 == 0 && j%2 == 0)
            return false;
        if(i%2 == 1 && j%2 == 1)
            return false;
        return true;
    }
}