import java.util.*;
class LongestCommonSubsequenceDP{
  public static void main(String[] args) 
    { 
      LongestCommonSubsequenceDP lcs = new LongestCommonSubsequenceDP(); 
      String s1 = "AGGTAB"; 
      String s2 = "GXTXAYB"; 
    
      char[] X=s1.toCharArray(); 
      char[] Y=s2.toCharArray(); 
      int m = X.length; 
      int n = Y.length; 
    
      System.out.println("Length of LCS is" + " " + 
                                    lcs.lcs( X, Y, m, n ) ); 
    }   
  
  
  int lcs( char[] X, char[] Y, int m, int n ) 
    { int[][] dp = new int[m+1][n+1];
      for(int i = 0; i<=m;i++)
      { for(int j = 0; j<=n; j++)
        {
        if (i == 0 || j == 0) 
            dp[i][j] = 0; 
        else if (X[i-1] == Y[j-1]) 
            dp[i][j]= 1 + dp[i-1][j-1]; 
        else
            dp[i][j] = max(dp[i][j-1],dp[i-1][j]); 
        
        } 
    } 
    return dp[m][n];
}
    
    /* Utility function to get max of 2 integers */
    int max(int a, int b) 
    { 
      return (a > b)? a : b; 
    } 
    
    
}