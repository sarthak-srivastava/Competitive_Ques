class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0 && haystack.length() != 0)
            return 0;
            
        if(haystack.length() == 0 && needle.length() != 0)
                return -1;
        if(haystack.length()<needle.length())
            return -1;
        int len = needle.length();
        StringBuilder str = new StringBuilder("");
        int i = 0;
        
        for(i = 0; i<len; i++)
        {
            str.append(haystack.charAt(i));
        }
        StringBuilder target = new StringBuilder(needle);
        // StringBuilder hs = new StringBuilder(haystack);
        if(Equals(str,target) == true)
            return 0;
        int c = 1;
        // System.out.println(str);
        while(i<haystack.length())
        {
            str.deleteCharAt(0);
            str.append(haystack.charAt(i));
            // System.out.println(str);
            boolean eq = Equals(str,target);
            // System.out.println(eq);
            if(eq== true)
                return c;
            c++;
            i++;
        }
        return -1;
    }
    boolean Equals(StringBuilder str,StringBuilder target)
    {
        if(str.length()!=target.length())
            return false;
        for(int i = 0; i<str.length();i++)
        {
            if(str.charAt(i)!=target.charAt(i))
                return false;
        }
        return true;
    }
}
