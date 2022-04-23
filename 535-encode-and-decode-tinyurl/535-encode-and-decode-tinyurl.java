public class Codec 
{
    HashMap<Integer, String> map = new HashMap<>();
    int key = 1;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) 
    {
        map.put(key, longUrl);
        key++;
        return ((key-1)+"");
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) 
    {
        int t = Integer.parseInt(shortUrl);
        return map.get(t);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));