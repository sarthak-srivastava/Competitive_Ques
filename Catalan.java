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
	     double[] catalan = new double[n+1];
	     catalan[0] = 1;
	     catalan[1] = 1;
	     for(int i = 2;i<=n;i++)
	     {   
	         for(int j = 0;j<i;j++)
	         catalan[i] += catalan[j]*catalan[i-j-1];
	     }
	     System.out.println(catalan[n]);
	 }
	 }
}
