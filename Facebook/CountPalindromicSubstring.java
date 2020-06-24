public class Solution {
    /**
     * @param str: s string
     * @return: return an integer, denote the number of the palindromic substrings
     */
    public int countPalindromicSubstrings(String str) {
        // write your code here
        if(str == null || str.length() == 0)
            return 0;
        int ans = 0;
        boolean[][] dp = new boolean[str.length()][str.length()];
        for(int i = 0; i<dp.length; i++)
            {   ans++;
                dp[i][i] = true;        
        }
        for(int i = 0; i<str.length() - 1; i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
                {
                    dp[i][i+1] = true;
                    ans++;
                }
        }
        for (int k = 3; k <= str.length(); ++k) { 
              for (int i = 0; i < str.length() - k + 1; ++i) { 
                int j = i + k - 1; 
                if (dp[i + 1][j - 1] 
                    && str.charAt(i) == str.charAt(j)) { 
                    dp[i][j] = true;
                    ans++;
        }
            }
        }
        return ans;
    }
}
