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
	     int sum = 0;
	     int n = sc.nextInt();
	     for(int i = 0; i<n-1;i++)
	     sum += sc.nextInt();
	     System.out.println((n*(n+1)/2)-sum);
	 }
	 }
}
