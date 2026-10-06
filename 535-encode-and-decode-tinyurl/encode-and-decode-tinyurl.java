public class Codec {

    // Encodes a URL to a shortened URL.
    Map<String,String> map = new HashMap<>();
    int id=0;
    String baseUrl = "http://tinyurl.com/";
    public String encode(String longUrl) {
        String s1=baseUrl+id++;
        map.put(s1,longUrl);
        return s1;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));