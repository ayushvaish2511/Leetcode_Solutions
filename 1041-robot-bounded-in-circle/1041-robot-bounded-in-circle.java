class Solution {
    public boolean isRobotBounded(String instructions) 
    {
        int x = 0;
        int y = 0;
        char current = 'N';
        String change = "NESW";
        int curr = 0;
        for(int i = 0; i<instructions.length(); i++)
        {
            char ch = instructions.charAt(i);
            if(ch == 'G')
            {
                switch(current)
                {
                    case 'N' : y++;
                                break;
                    case 'S' : y--;
                                break;
                    case 'E' : x++;
                                break;
                    case 'W' : x--;
                                break;
                }
            }
            else if(ch == 'L')
            {
                curr--;
                if(curr<0)
                    curr = 3;
                current = change.charAt(curr);
            }
            else 
            {
                curr++;
                if(curr>3)
                    curr = 0;
                current = change.charAt(curr);
            }
        }
        if(current != 'N' || (x==0 && y==0))
            return true;
        return false;
    }
}