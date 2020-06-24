public class Solution {
    /*
     * @param s: A string
     * @param dict: A dictionary of words dict
     * @return: A boolean
     */
    public boolean wordBreak(String s, Set<String> dict) {
        // write your code here
        if(s.length() == 0 && dict.size() == 0)
            return true;
        if(dict.size() == 0)
            return false;
        Set<String> dic = new HashSet<>(dict);
        boolean[] dp = new boolean[s.length() + 1];
        for(int i = 0; i< s.length(); i++)
        {
            for(int j = 0; j<=i; j++)
            {
                String curr = s.substring(j, i + 1);
                if(dic.contains(curr) && (j == 0 || dp[j-1] == true))
                {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length() - 1];
    }
}
