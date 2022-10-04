class Solution {
    public String decodeMessage(String key, String message) 
    {
        HashMap<String, String> ktv = new HashMap<>();
        int ch = 97;
        for(int i = 0; i<key.length(); i++)
        {
            char curr = key.charAt(i);
            if(curr == ' ')
                continue;
            if(!ktv.containsKey(curr + ""))
            {
                ktv.put(curr+"", (char)ch + "");
                ch++;
            }
        }
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i<message.length(); i++)
        {
            if(message.charAt(i) != ' ')
                ans.append(ktv.get(message.charAt(i) + ""));
            else 
                ans.append(" ");
        }
        return ans.toString();
    }
}