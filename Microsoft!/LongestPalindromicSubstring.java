class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return "";
        int len = s.length();
        if(len == 1)
            return s;
        boolean[][] palindrome = new boolean[len][len];
        for(int i = 0; i<len; i++)
            palindrome[i][i] = true;
        int maxlen = 1;
        int start = 0;
        for(int i = 0; i<len - 1; i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {   palindrome[i][i+1] = true;
                maxlen = 2;
                start = i;
            }
        }
        
        for (int k = 3; k <= len; k++) { 
            for (int i=0; i < len-k+1; i++)  
            { 
                int j = i+k-1; 

                if (palindrome[i + 1][j - 1] && s.charAt(i) ==  
                                          s.charAt(j)) { 
                    palindrome[i][j] = true; 
  
                    if (k > maxlen) { 
                        start = i; 
                        maxlen = k; 
                    } 
                } 
            } 
        }
        
        return s.substring(start,start + maxlen );
        
    }
}
