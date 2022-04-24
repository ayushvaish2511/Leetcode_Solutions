class UndergroundSystem 
{
    HashMap<Integer, Integer> inTime;   //id, strt time
    HashMap<Integer, Integer> outTime;  //id, end time
    HashMap<Integer, String> strtCity;  //id, strt city
    HashMap<Integer, String> endCity;   //id, end city
    HashMap<String, Integer> Time;   //strt city + " " + end city, total time taken
    HashMap<String, Integer> tripsCount;    //strt city + " " + end city, total trips taken
    public UndergroundSystem() 
    {
        inTime = new HashMap<>();
        outTime = new HashMap<>();
        strtCity = new HashMap<>();
        endCity = new HashMap<>();
        Time = new HashMap<>();
        tripsCount = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) 
    {
        inTime.put(id, t);
        strtCity.put(id, stationName);
    }
    
    public void checkOut(int id, String stationName, int t) 
    {
        outTime.put(id, t);
        endCity.put(id, stationName);
        String trip = strtCity.get(id) + " " + endCity.get(id);
        int ti = outTime.get(id) - inTime.get(id);
        if(Time.containsKey(trip))
        {
            Time.put(trip, Time.get(trip) + ti);
        }
        else
        {
            Time.put(trip, ti);
        }
        
        if(tripsCount.containsKey(trip))
        {
            tripsCount.put(trip, tripsCount.get(trip) + 1);
        }
        else 
        {
            tripsCount.put(trip, 1);
        }
    }
    
    public double getAverageTime(String startStation, String endStation) 
    {
        String trip = startStation + " " + endStation;
        int t = Time.get(trip);
        int c = tripsCount.get(trip);
        double avg = (t*1.0)/c;
        return avg;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */