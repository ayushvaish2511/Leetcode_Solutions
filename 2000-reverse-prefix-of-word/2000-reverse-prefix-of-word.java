class Solution {
    public String reversePrefix(String word, char ch) 
    {
        int ind = word.indexOf(ch); 
        if(ind == -1)
            return word;
        StringBuilder ans = new StringBuilder("");
        for(int i = ind; i>=0; i--)
            ans.append(word.charAt(i));
        ans.append(word.substring(ind+1));
        return ans.toString();
    }
}