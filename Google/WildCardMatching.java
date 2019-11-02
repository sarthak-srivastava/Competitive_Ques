class Solution {
    public boolean isMatch(String s, String p) {
       boolean[][] dp=new boolean[s.length()+1][p.length()+1];
        dp[s.length()][p.length()]=true;
        for(int i=p.length()-1;i>=0;i--){
            if(p.charAt(i)!='*')
                break;
            else
                dp[s.length()][i]=true;
        }
        for(int i=s.length()-1;i>=0;i--){
            for(int j=p.length()-1;j>=0;j--){
                if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?')
                        dp[i][j]=dp[i+1][j+1];
                else if(p.charAt(j)=='*')
                        dp[i][j]=dp[i+1][j]||dp[i][j+1];
                else
                    dp[i][j]=false;
            }
        }
        return dp[0][0];
    }
            }
