public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        if(A == null || A.length() == 0)
            return 0;
        int length = 0;
        String B = A.trim();
        int n = B.length();
        for(int i = 0; i<n; i++)
        {
            int curr = B.charAt(i);
            if(curr == ' ')
            {
                length = 0;
            }
            else
            {
                length++;
            }
        }
        return length;
    }
}
