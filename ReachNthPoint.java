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
	   //  int ans = 0;
	     System.out.println(numberOfWays(n,new long[n+1]));
	 }
	 }
	 public static long numberOfWays(int n, long[] qb)
	 {  if(n<0)
	    return 0;
	    if(n==0)
	    return qb[n] = 1;
	    if(qb[n]!=0)
	    return qb[n];
	     qb[n] = numberOfWays(n-1,qb)+numberOfWays(n-2,qb);
	     return qb[n];
	 }
}
