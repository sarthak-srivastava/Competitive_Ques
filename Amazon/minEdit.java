import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	     int n = sc.nextInt();
	     int m = sc.nextInt();
	     String s1 = sc.next();
	     String s2 = sc.next();
	     System.out.println(dpEdit(n,m,s1,s2,new int[n+1][m+1]));
	 }
	 }
	 public static int dpEdit(int n, int m, String s1, String s2, int[][] dp)
	 {
	     if(n == 0)
	     return dp[n][m] = m;
	     if(m == 0)
	     return dp[n][m] = n;
	     if(dp[n][m]!=0)
	     return dp[n][m];
	     if(s1.charAt(n-1) == s2.charAt(m-1))
	     return dp[n][m] = dpEdit(n-1,m-1,s1,s2,dp);
	     else
	     return dp[n][m] = Integer.min(dpEdit(n-1,m,s1,s2,dp),Integer.min(dpEdit(n,m-1,s1,s2,dp),dpEdit(n-1,m-1,s1,s2,dp)))+1;
	 }
}
