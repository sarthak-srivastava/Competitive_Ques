class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
       if(text1 == null || text2 == null || text1.length() == 0 || text2.length() == 0)
           return 0;
        return longestCommonSubsequence(text1,text2,new int[text1.length()+1][text2.length()+1]);
    }
    public int longestCommonSubsequence(String text1, String text2, int[][] qb)
    {    if(qb[text1.length()][text2.length()]!=0)
            return qb[text1.length()][text2.length()];
         if(text1.length() == 0 || text2.length() == 0)
            return 0;
        if(text1.charAt(0) == text2.charAt(0))
        {
            return qb[text1.length()][text2.length()] = 1 + longestCommonSubsequence(text1.substring(1),text2.substring(1),qb);
        }
        else
            return qb[text1.length()][text2.length()] = Integer.max(longestCommonSubsequence(text1,text2.substring(1),qb),longestCommonSubsequence(text1.substring(1),text2,qb));
    }
}
