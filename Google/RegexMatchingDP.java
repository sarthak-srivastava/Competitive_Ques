// p[pi] -> . then move si by 1 and pi by 1
// p[pi] -> some character followed by another character, simple match -> return false if nno match else move pi, si by 1
// p[pi] -> some character followed by *
// case 1: character matched 1 or more consecutive occurence of the same character in s
// case 2: character does not match and we take 0 ocurrence of this character and just move pi


class Solution {
    public boolean isMatch(String s, String p) {
       boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[s.length()][p.length()] = true;
       if(p.length() == 0)
           return s.length() == 0;
        for(int i = s.length()  ;i>=0;i--)
        {
            for(int j = p.length() - 1 ;j>=0;j--)
            {
        boolean first_match = ( (i<s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')));
        if(j+1<p.length() && p.charAt(j+1) == '*')
        {
         dp[i][j] = dp[i][(j+2)] || (first_match && dp[i+1][j]);
        }
        else
         dp[i][j] = first_match && dp[i+1][j+1];
    }
}
        return dp[0][0];
    }
}
