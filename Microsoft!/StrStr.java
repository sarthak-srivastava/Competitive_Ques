public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int strStr(final String B, final String A) {
        if(A.length() == 0)
        {
            if(B.length() == 0)
                return -1;
            return 0;
        }
        if(B.length() == 0)
            return -1;
        int i = 0;
        for(i = 0; i <= B.length() - A.length(); i++ )
        {
            if(B.substring(i,i + A.length()).equals(A))
                return i;
        }
        return -1;
    }
}
