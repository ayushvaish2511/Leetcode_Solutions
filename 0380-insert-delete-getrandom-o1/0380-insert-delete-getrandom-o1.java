class RandomizedSet {
    HashSet<Integer> hs;
    Random random ;
    public RandomizedSet() {
        hs = new HashSet<Integer>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(hs.contains(val))
            return false;
        hs.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(hs.contains(val))
        {
            hs.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Integer[] arrayNumbers = hs.toArray(new Integer[hs.size()]);
        return arrayNumbers[random.nextInt(hs.size())];   
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */