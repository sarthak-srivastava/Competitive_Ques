import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc  = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	     int l1 = sc.nextInt();
	     int l2 = sc.nextInt();
	     String s1 = sc.next();
	     String s2 = sc.next();
	     System.out.println(lcs(s1,s2,l1-1,l2-1,new int[l1][l2]));
	     
	 }
	 }
	 public static int lcs(String s1, String s2, int l1, int l2, int[][] qb)
	 {
	     if(l1<0 || l2<0)
	     return 0;
	     if(qb[l1][l2]!=0)
	     return qb[l1][l2];
	     if(s1.charAt(l1) == s2.charAt(l2))
	     return qb[l1][l2] = 1+lcs(s1,s2,l1-1,l2-1,qb);
	     else
	     return qb[l1][l2] = Integer.max(lcs(s1,s2,l1,l2-1,qb),lcs(s1,s2,l1-1,l2,qb));
	 }
}
