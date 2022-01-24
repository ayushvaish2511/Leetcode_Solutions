class Solution {
    public boolean halvesAreAlike(String s) {
        int ci = 0, cj = 0, i = 0, j = s.length()-1;
        String vow = "AEIOUaeiou";
        while(i<j)
        {
            if(vow.indexOf(s.charAt(i)) != -1)
                ci++;
            if(vow.indexOf(s.charAt(j)) != -1)
                cj++;
            i++;
            j--;
        }
        return ci==cj;
    }
}