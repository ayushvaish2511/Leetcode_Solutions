class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] conv = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> st = new HashSet<>();
        for(String word : words)
        {
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i<word.length(); i++)
            {
                char ch = word.charAt(i);
                sb.append(conv[ch-'a']);
            }
            st.add(sb.toString());
        }
        return st.size();
    }
}