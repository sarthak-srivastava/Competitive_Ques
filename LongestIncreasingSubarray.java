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
	     int n =sc.nextInt();
	     int[] arr = new int[n];
	     for(int i = 0;i<n; i++)
	     arr[i] = sc.nextInt();
	     int len = 1;
	     int max = 1;
	     for(int i = 1; i<n;i++)
	     {
	         if(arr[i-1]<arr[i])
	         {
	             len++;
	         }
	         else
	         {
	             max = Integer.max(len,max);
	             len = 1;
	         }
	     }
	     System.out.println(Integer.max(len,max));
	 }
	 }
}
