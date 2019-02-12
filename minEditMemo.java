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
	 {  int m = sc.nextInt();
	    int n = sc.nextInt();
	     String s1= sc.next();
	     String s2 = sc.next();
	     int[][] qb = new int[s1.length()][s2.length()];
	   //  for(int i = 0;i<qb.length;i++)
	   //  {
	   //      for(int j = 0;j<qb[0].length;j++)
	   //      qb[i][j] = -1;
	   //  }
	     System.out.println(minEdit(s1,s2,s1.length(),s2.length(),qb));
	 }
	 
	 }
	 public static int minEdit(String s1,String s2, int m,int n,int[][] qb)
	 {
	     if(m == 0)
	     return n;
	     if(n == 0)
	     return m;
	     if(qb[m-1][n-1]!=0)
	     return qb[m-1][n-1];
	     if (s1.charAt(m-1) == s2.charAt(n-1)) 
         return qb[m-1][n-1] = minEdit(s1, s2, m-1, n-1,qb);
	     return qb[m-1][n-1] = 1+Integer.min(Integer.min(minEdit(s1,s2,m-1,n,qb),minEdit(s1,s2,m,n-1,qb)),minEdit(s1,s2,m-1,n-1,qb));
	     
	 }
}
