class Solution {
    public boolean checkPalindrome(String word)
    {
        int strt = 0;
        int end = word.length()-1;
        while(strt<=end)
        {
            if(word.charAt(strt) != word.charAt(end))
                return false;
            strt++;
            end--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) 
    {
        String ans = "";
        for(int i = 0; i<words.length; i++)
        {
            if(checkPalindrome(words[i]))
            {
                ans = words[i];
                break;
            }
        }
        return ans;
    }
}