class Solution {
    public int numRescueBoats(int[] people, int limit) 
    {
        Arrays.sort(people);
        int ans1 = 0;
        int i = 0;
        for(i = 0; i<people.length-1; i++)
        {
            if(people[i] + people[i+1] <=limit)
            {
                ans1++;
                i++;
            }
            else 
            {
                ans1++;
            }
            
        }
        if(i == people.length-1)
            ans1++;
        
        //Two pointer
        int ans2 = 0;
        int st = 0;
        int end = people.length-1;
        while(st<=end)
        {
            if(people[st] + people[end] <=limit)
            {
                ans2++;
                st++;
                end--;
            }
            else if(people[st+1] + people[end] <=limit)
            {
                ans2 +=2;
                st +=2;
                end--;
            }
            else 
            {
                ans2++;
                end--;
            }
        }
        return ans1 < ans2 ? ans1 : ans2;
    }
}