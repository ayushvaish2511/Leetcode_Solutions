class Solution {
    public String sortVowels(String s) {
        String vow = "aeiouAEIOU";
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(vow.indexOf(ch) != -1)
            {
                arr.add(ch);
            }
        }
        if(arr.size() == 0)
            return s;
        Collections.sort(arr);
        StringBuilder sb = new StringBuilder("");
        int j = 0;
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(vow.indexOf(ch)!=-1)
            {
                sb.append(arr.get(j++));
            }
            else 
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}