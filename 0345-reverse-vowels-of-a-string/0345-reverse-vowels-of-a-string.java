class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        String vow = "aeiouAEIOU";
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(vow.indexOf(ch)!=-1)
            {
                arr.add(ch);
            }
        }
        StringBuilder ans = new StringBuilder("");
        int n = arr.size()-1;
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(vow.indexOf(ch)!=-1)
            {
                ans.append(arr.get(n));
                n--;
            }
            else 
            {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}