class MyCalendar {
    ArrayList<ArrayList<Integer>> slots;
    public MyCalendar() 
    {
        slots = new ArrayList<>();
    }
    
    public boolean book(int start, int end) 
    {
        for(int i = 0; i<slots.size(); i++)
        {
            if((start < slots.get(i).get(1)) && (end > slots.get(i).get(0)))
            {
                return false;
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        slots.add(temp);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */