class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()];
        for(int i = 0;i<s.length();i++)
        {
                for(int j = 0; j<= i; j++)
                {
                    String sub = s.substring(j,i+1);
                    if(hs.contains(sub) && (j == 0 || dp[j-1] == true))
                    {
                        dp[i] = true;
                        break;
                    }
                }
        }
        return dp[s.length() - 1];
    }
}
