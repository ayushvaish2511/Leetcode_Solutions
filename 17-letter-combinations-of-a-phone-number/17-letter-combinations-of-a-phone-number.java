class Solution {
    public List<String> letterCombinations(String digits) 
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0)
            return ans;
        Queue<String> qu = new LinkedList<>();
        qu.add("");
        while(!qu.isEmpty())
        {
            String a = qu.remove();
            if(a.length() == digits.length())
                ans.add(a);
            else
            {
                String b = map.get(digits.charAt(a.length())+"");
                for(int i = 0; i<b.length(); i++)
                {
                    qu.add(a + b.charAt(i));
                }
            }
        }
        return ans;
    }
}