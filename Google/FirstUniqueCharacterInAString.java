class Solution {
    public int firstUniqChar(String s) {
        if(s == null || s.length() <= 0)
            return -1;
        int[] arr = new int[26];
        for(char ch: s.toCharArray())
        {
            arr[ch - 'a']++;
        }
        int c = 0;
         for(char ch: s.toCharArray())
        {   
            if(arr[ch - 'a']==1)
                return c;
            c++;
         }
        return -1;
        
    }
}
