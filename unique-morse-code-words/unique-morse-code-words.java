class Solution {
    public int uniqueMorseRepresentations(String[] words) 
    {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        int n = words.length;
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++)
        {
            StringBuilder str = new StringBuilder("");
            for(int j = 0; j<words[i].length(); j++)
            {
                int ch = (words[i].charAt(j)) - 'a';
                str.append(morse[ch]);
            }
            
            if(map.containsKey(str.toString()))
            {
                map.put(str.toString(), map.get(str.toString())+1);
            }
            else 
            {
                map.put(str.toString(), 1);
            }
        }
        int c = map.size();
        return c;
    }
}