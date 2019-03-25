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
	     String str = sc.next();
	     int[] qb = new int[str.length()+1];
	     if(str.charAt(0) == '0')
	     {
	         System.out.println(0);
	         continue;
	     }
	     
	     qb[0] = 1;
	     qb[1] = 1;
	     for(int i =2; i<=n;i++)
	     {
	         if(str.charAt(i-1)>'0')
	         qb[i] =qb[i-1];
	         if(str.charAt(i-2) == '1' || (str.charAt(i-2) == '2' && str.charAt(i-1)<'7'))
	         qb[i] += qb[i-2];
	     }
	     System.out.println(qb[n]);
	 }
	 }
}
