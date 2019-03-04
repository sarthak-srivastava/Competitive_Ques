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
	     int s = sc.nextInt();
	     int[] arr = new int[s];
	     for(int i = 0;i<s;i++)
	     arr[i] = sc.nextInt();
	     int res = arr[0];
	     for(int i = 1;i<s;i++)
	     {
	         res = gcd(arr[i],res);
	     }
	     System.out.println(res);
	 }
	 }
	 public static int gcd(int a, int b)
	 {
	     if(a == 0)
	     return b;
	     return gcd(b%a,a);
	 }
}
