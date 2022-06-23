class Solution {
    public int scheduleCourse(int[][] courses) 
    {
        Arrays.sort(courses, (a, b) -> Integer.compare(a[1], b[1]));
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());    
        int currentTotalTime = 0;
        for(int i = 0; i<courses.length; i++)
        {
            heap.add(courses[i][0]);
            currentTotalTime += courses[i][0];
            if(currentTotalTime > courses[i][1])
            {
                currentTotalTime -= heap.poll();
            }
        }
        return heap.size();
    }
}