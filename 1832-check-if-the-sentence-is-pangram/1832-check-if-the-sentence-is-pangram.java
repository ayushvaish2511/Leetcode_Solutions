class Solution {
    public boolean checkIfPangram(String s) 
    {
        HashSet<Character> seen = new HashSet<>();
        for(int i = 0; i<s.length(); i++)
        {
            seen.add(s.charAt(i));
        }
        return seen.size() == 26;
    }
}