// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> 
{
    Iterator<Integer> samp;
    boolean hasIterated;
    Integer last;
    public PeekingIterator(Iterator<Integer> iterator) 
    {
	    samp = iterator;
	    hasIterated = false;
        last = null;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() 
    {
        if(!hasIterated)
        {
            hasIterated = true;
            last = samp.next();
        }
        return last;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() 
    {
        if(!hasIterated)
            return samp.next();
        Integer p = last;
        last = null;
        hasIterated= false;
	    return p;    
	}
	
	@Override
	public boolean hasNext() 
    {
        if(hasIterated)
            return true;
            
	    return samp.hasNext();    
	}
}