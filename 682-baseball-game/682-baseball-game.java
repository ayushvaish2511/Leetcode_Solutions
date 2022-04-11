class Solution {
    public int calPoints(String[] ops) 
    {
        Stack<Integer> record = new Stack<>();
        for(int i = 0; i<ops.length; i++)
        {
            switch(ops[i])
            {
                case "+" : int l = (record.pop()).intValue();
                           int sl = (record.peek()).intValue();
                           record.push(l);
                           record.push(l+sl);
                           break;
                case "D" : int la = (record.peek()).intValue();
                           record.push(2*la);
                           break;
                case "C" : record.pop();
                           break;
                default :  int las = Integer.parseInt(ops[i]);
                           record.push(las);
                           break;
            }
        }
        int sum = 0;
        while(!record.empty())
        {
            sum += record.pop();
        }
        return sum;
    }
}