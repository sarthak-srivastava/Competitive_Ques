/*
dp solution
list dimension - s.length() x p.length()
dp[i][j] = is string starting from i in s and j in p valid matches.
if s[i] == p[j] then dp[i][j] is true
if p[j] == '.' then dp[i][j] == true
if p[j] == '*':
    1  if p[j-1] != s[i] : dp[i][j] = dp[i][j-2]  //in this case, a * only counts as empty
    2  if p[j-1] == s[i] or p[j-1] == '.':
                dp[i][j] = dp[i-1][j]    //in this case, a* counts as multiple a 
             or dp[i][j] = dp[i][j-1]   // in this case, a* counts as single a
             or dp[i][j] = dp[i][j-2]   // in this case, a* counts as empty
    
*/
class Solution {

    public boolean isMatch(String s, String p) {
        if(s == null || p == null )
            return false;
       if (p.length() == 0) return (s.length() == 0);
        
        boolean dp[][] = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;
        for (int j=2; j<=p.length(); j++) {
            dp[0][j] = p.charAt(j-1) == '*' && dp[0][j-2]; 
        }
        
        for (int j=1; j<=p.length(); j++) {
            for (int i=1; i<=s.length(); i++) {
                if (p.charAt(j-1) == s.charAt(i-1) || p.charAt(j-1) == '.') 
					dp[i][j] = dp[i-1][j-1];
                else if(p.charAt(j-1) == '*')
                    dp[i][j] = dp[i][j-2] || ((s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.') && dp[i-1][j]); 
            }
        }
        return dp[s.length()][p.length()];

        
    }
}
