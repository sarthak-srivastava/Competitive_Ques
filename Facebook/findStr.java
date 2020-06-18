public class Solution {
    /**
     * @param source: 
     * @param target: 
     * @return: return the index
     */
    public int strStr(String source, String target) {
        // Write your code here
        if( target.length() > source.length())
            return -1;
        if(target.length() < 1)
            return 0;
        StringBuilder sb = new StringBuilder(source.substring(0,target.length()));
        if(equalBuilder(sb,target))
            return 0;
        for(int i = target.length(); i<source.length();i++)
        {
            sb.deleteCharAt(0);
            sb.append(source.charAt(i));
            if(equalBuilder(sb,target))
                return i - target.length() + 1;
        }
        return -1;
    }
    public boolean equalBuilder(StringBuilder sb, String str)
    {
        for(int i = 0;i < str.length(); i++)
        {
            char a = sb.charAt(i);
            char b = str.charAt(i);
            if(a!=b)
                return false;
        }
        return true;
    }
}
