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
	     System.out.println(NumOfWays(n,new long[n+1]));
	 }
	 }
	 public static long NumOfWays(int n, long[] dp)
	 {
	     if(n == 1 || n == 2)
	     return dp[n] = n;
	     if(dp[n]!=0)
	     return dp[n];
	     else
	     return dp[n] = NumOfWays(n-1,dp)+NumOfWays(n-2,dp);
	     
	 }
}
