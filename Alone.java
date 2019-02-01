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
	     int c = sc.nextInt();
	     int[] q = new int[n];
	     q[0] = c;
	     for(int i =1;i<n;i++)
	     {q[i] = sc.nextInt();
	     c ^=q[i];
	     
	         
	         
	         
	     }
	     System.out.println(c);
	 }
	 }
}
