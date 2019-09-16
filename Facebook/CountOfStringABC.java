import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {  static int ans = 0;
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	     int n = sc.nextInt();
	     ans = 0;
	     ans = findCombos(n,1,2,new int[n+1][2][3]);
	     System.out.println(ans);
	 }
	 }
	 public static int findCombos(int n, int b, int c, int[][][] qb)
	 {    
	     if(b<0 || c<0)
	     return 0;
	     if(n == 0)
	     {
	         ans++;
	         return 1;
	     }
	     if(qb[n][b][c]!=0)
	     return qb[n][b][c];
	     qb[n][b][c] += findCombos(n-1,b,c,qb);
	     qb[n][b][c] += findCombos(n-1,b-1,c,qb);
	     qb[n][b][c] += findCombos(n-1,b,c-1,qb);
	     return qb[n][b][c];
	 }
}
