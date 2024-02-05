class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            freq[(int)(ch-'a')]++;
        }
        for(int i = 0; i<s.length(); i++)
        {
            int index = (int)(s.charAt(i)-'a');
            if(freq[index] == 1)
                return i;
        }
        return -1;
    }
}