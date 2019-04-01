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
	     int[] arr = new int[n];
	   //  for(int i = 0;i<n;i++)
	     
	     int exc = 0;
	     int inc = sc.nextInt();
	     for(int i = 1;i<n;i++)
	     {   arr[i] = sc.nextInt();
	         int new_exc = Integer.max(exc,inc);
	         inc = arr[i]+exc;
	         exc = new_exc;
	     }
	     System.out.println(Integer.max(inc,exc));
	 }
	 }
}
