public class Codec {
    HashMap<String,String> keyValue = new HashMap<String,String>();
    HashMap<String,String> valueKey = new HashMap<String,String>();
    static String baseUrl = "http://tinyurl.com/";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String values = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder key = new StringBuilder("");
        while(key.length()<6 )
        {
          
          char curr  = values.charAt((int)(Math.random() * (values.length()-1)));
          key.append(curr);
          if(keyValue.containsKey(key))
              key = new StringBuilder("");
        }
        String temp = new String(key);
        valueKey.put(longUrl,temp);
        keyValue.put(temp,longUrl);
        return baseUrl + temp;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.split(baseUrl)[1];
        return keyValue.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
