class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) 
    {
        Arrays.sort(products);
        HashMap<String, List<String>> map = new HashMap<>();
        for(String prod : products)
        {
            StringBuilder st = new StringBuilder("");
            for(int i = 0; i<prod.length(); i++)
            {
                st.append(prod.charAt(i)+"");
                String a = st.toString();
                if(map.containsKey(a))
                {
                    if(map.get(a).size() < 3)
                    {
                        List<String> c = map.get(a);
                        c.add(prod);
                        map.put(a, c);
                    }
                }
                else
                {
                    List<String> c = new ArrayList<>();
                    c.add(prod);
                    map.put(a, c);
                }
            }
        }
        List<List<String>> ans = new ArrayList<>();
        StringBuilder sub = new StringBuilder("");
        for(int i = 0; i<searchWord.length(); i++)
        {
            sub.append(searchWord.charAt(i)+"");
            if(map.containsKey(sub.toString()))
                ans.add(map.get(sub.toString()));
            else
                ans.add(new ArrayList<>());
        }
        return ans;
    }
}