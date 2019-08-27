class Solution {
    public String longestPalindrome(String s) {
           int maxlen = 0;
        int start = 0;
          if(s.length()<=1)
                return s;
        maxlen = 1;
        for(int i = 1; i<s.length();i++)
        {
            int low = i-1;
            int high = i;
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high))
            {
                if(high - low + 1 > maxlen)
                {
                    maxlen = high - low + 1;
                    start = low;
                }
                low--;
                high++;
            }
            
        }
                for(int i = 1; i<s.length();i++)
        {
            int low = i-1;
            int high = i+1;
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high))
            {
                if(high - low + 1 > maxlen)
                {
                    maxlen = high - low + 1;
                    start = low;
                }
                low--;
                high++;
            }
            
        }
        // ?if(maxlen%2==0)
          
            return s.substring(start,start+maxlen);
        
    }
}
