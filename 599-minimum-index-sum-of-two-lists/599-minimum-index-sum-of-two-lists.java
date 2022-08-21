class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) 
    {
        HashMap<String,Integer> map1 = new HashMap<String, Integer>();
        for(int i = 0; i < list1.length; i++)
        {
            map1.put(list1[i], i);
        }
        HashMap<String,Integer> map2 = new HashMap<String, Integer>();
        ArrayList<String> common  = new ArrayList<>();
        for(int i = 0; i < list2.length; i++)
        {
            map2.put(list2[i], i);
            if(map1.containsKey(list2[i]))
                common.add(list2[i]);
        }
        if(common.size() != 1)
        {
            int min = Integer.MAX_VALUE;
            for(int i = 0; i<common.size(); i++)
            {
                int ind1 = map1.get(common.get(i));
                int ind2 = map2.get(common.get(i));
                if((ind1 + ind2) < min)
                    min = ind1 + ind2;
            }
            ArrayList<String> st = new ArrayList<>();
            for(int i = 0; i<common.size(); i++)
            {
                int ind1 = map1.get(common.get(i));
                int ind2 = map2.get(common.get(i));
                if((ind1 + ind2) == min)
                    st.add(common.get(i));
            }
            String[] ans = new String[st.size()];
            for(int i = 0; i<st.size(); i++)
            {
                ans[i] = st.get(i);
            }
            return ans;
        }
        String[] ans = new String[1];
        ans[0] = common.get(0);
        return ans;
    }
}