class Solution {
    public int minDeletionSize(String[] str) {
        int c = 0;
        for(int i = 0; i<str[0].length(); i++)
        {
            for(int j = 0; j<str.length-1; j++)
            {
                if(str[j].charAt(i) > str[j+1].charAt(i))
                {
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}